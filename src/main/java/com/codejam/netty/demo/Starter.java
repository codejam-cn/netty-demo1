package com.codejam.netty.demo;

import lombok.extern.slf4j.Slf4j;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * ByteBuffer 正确使用姿势
 * 1. 向buffer写入数据，例如调用 channel.read(buffer)
 * 2. 调用flip()切换至读模式
 * 3. 从buffer读取数据，例如调用 buffer.get()
 * 4. 调用clear(） 或 compact 切换至写模式
 * 5. 重复1~4步骤
 */
@Slf4j
public class Starter {

    public static void main(String[] args) throws IOException {


        //FileChannel 数据的读写通道

        //1.输入流，输出流
        //2.RandomAccessFile
        FileChannel channel = new FileInputStream("D:\\Code\\my\\netty-demo1\\netty-demo1\\target\\classes\\data.txt").getChannel();

        //channel = new FileInputStream("data.txt").getChannel();
        try {


            //准备缓冲区
            ByteBuffer buffer = ByteBuffer.allocate(100);

            while (true) {
                //从channel读取数据，向buffer写
                int read = channel.read(buffer);
                if (read == -1) {
                    break;
                }

                log.info("aaaaaaaaaa");

                //buffer内容打印
                buffer.flip();  //切换至读模式


                while (buffer.hasRemaining()) {
                    byte b = buffer.get(); //一次一个字节
                    System.out.print((char) b);

                }

                //读完以后，buffer切换成写模式
                buffer.clear();
            }

        } catch (Exception e) {
        } finally {
            channel.close();
        }


    }
}
