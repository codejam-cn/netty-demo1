package com.codejam.netty.demo;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

public class Netty5 {

    /**
     * heapBuffer 和 directByteBuffer的区别
     * <p>
     * HeapBuffer -- java堆内存，读写效率较低，收到GC的影响
     * DirectByteBuffer， --- 直接内存，读写效率高（少一次copy），不会受到GC的影响。分配效率低一些，而且如果使用不当可能会造成memory leak。
     *
     * @param args
     */
    public static void main(String[] args) {

        //1. getBytes

        ByteBuffer buffer = ByteBuffer.allocate(10);
        buffer.put(new byte[]{'a', 'b', 'c', 'd'});
        byte[] bytes = "hello".getBytes();



        //2. StandardCharsets
        ByteBuffer buffer2 = StandardCharsets.UTF_8.encode("world");

        System.out.println("buffer2.toString() = " + buffer2.toString());


        //3.wrap
        ByteBuffer wrap = ByteBuffer.wrap("hello".getBytes());
        boolean b = wrap.hasRemaining();
        while (wrap.hasRemaining()){
            char aChar = (char) wrap.get();
            System.out.println("aChar = " + aChar);
        }


        //--------------------------- Scattering Reads
        //分散读取
        
    }
}
