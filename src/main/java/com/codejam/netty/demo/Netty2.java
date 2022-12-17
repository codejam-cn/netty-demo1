package com.codejam.netty.demo;

import java.nio.ByteBuffer;

public class Netty2 {

    public static void main(String[] args) {


        ByteBuffer buffer = ByteBuffer.allocate(10);

        buffer.put((byte)(0x01));

        byte b = buffer.get();

        System.out.println(b);

        buffer.flip();


        System.out.println("buffer.get() = " + buffer.get());
    }
}
