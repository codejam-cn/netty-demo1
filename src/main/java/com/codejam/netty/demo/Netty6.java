package com.codejam.netty.demo;

import sun.applet.Main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Netty6 {


    public static void main(String[] args) throws IOException {

        String path2 = Netty6.class.getClassLoader().getResource("words.txt").getFile();
        System.out.println(path2);


        ByteBuffer allocate1 = StandardCharsets.UTF_8.encode("hello");
        ByteBuffer allocate2 = StandardCharsets.UTF_8.encode("world");
        ByteBuffer allocate3 = StandardCharsets.UTF_8.encode("你好");


        //使用channel，将内容写入文件。
        FileChannel channel1 = new RandomAccessFile("word2.txt", "rw").getChannel();


        int read = channel1.write(allocate1);

    }
}
