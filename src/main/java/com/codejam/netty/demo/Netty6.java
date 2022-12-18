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


    public static void main(String[] args) {

        String path2 = Netty6.class.getClassLoader().getResource("words.txt").getFile();
        System.out.println(path2);

        try (FileChannel channel = new RandomAccessFile(path2, "r").getChannel()) {

            ByteBuffer allocate1 = ByteBuffer.allocate(3);
            ByteBuffer allocate2 = ByteBuffer.allocate(3);
            ByteBuffer allocate3 = ByteBuffer.allocate(5);

            allocate1.flip();

            allocate2.flip();

            allocate3.flip();


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
