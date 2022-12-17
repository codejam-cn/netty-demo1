package com.codejam.netty.demo;

import java.nio.ByteBuffer;

public class Netty3 {

    /**
     * heapBuffer 和 directByteBuffer的区别
     *
     * HeapBuffer -- java堆内存，读写效率较低，收到GC的影响
     * DirectByteBuffer， --- 直接内存，读写效率高（少一次copy），不会受到GC的影响。分配效率低一些，而且如果使用不当可能会造成memory leak。
     *
     * @param args
     */
    public static void main(String[] args) {


        ByteBuffer buffer = ByteBuffer.allocate(6);


        Class<? extends ByteBuffer> aClass = buffer.getClass();
        System.out.println("aClass = " + aClass);

        ByteBuffer buffer1 = ByteBuffer.allocateDirect(16);

        System.out.println("buffer1 = " + buffer1);


        //向buffer写入数据
        /**
         * 1. 调用channel的read方法，
         *  int readBytes = channel.read(buf);
         *
         * 2. 调用buffer自己的put方法
         *  buf.put((byte)12);
         */

        //从buffer读取数据
        /**
         * 同样有两种方法
         *
         * 1. 调用channel的write方法
         *
         *  int writeBytes = channel.write(buf);
         *
         * 2. 调用buffer自己的get方法
         *
         *  byte b = buf.get();
         *
         *  其中，get方法会让position读指针向后走，如果想重复读取数据，
         *  可以调用 rewind，将position重置为0.
         *  或get(int i)方法获取索引i的内容，它不会移动读指针。
         *
         */




    }
}
