package com.codejam.netty.demo;

import java.nio.ByteBuffer;

public class Netty3 {

    /**
     * heapBuffer 和 directByteBuffer的区别
     *
     * HeapBuffer -- java堆内存，读写效率较低，收到GC的影响
     * DirectByteBuffer， --- 直接内存，读写效率高（少一次copy），不会受到GC的影响
     *
     * @param args
     */
    public static void main(String[] args) {


        ByteBuffer buffer = ByteBuffer.allocate(6);


        Class<? extends ByteBuffer> aClass = buffer.getClass();
        System.out.println("aClass = " + aClass);

        ByteBuffer buffer1 = ByteBuffer.allocateDirect(16);

        System.out.println("buffer1 = " + buffer1);


    }
}
