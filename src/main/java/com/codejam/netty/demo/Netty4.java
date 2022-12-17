package com.codejam.netty.demo;

import java.nio.ByteBuffer;

public class Netty4 {

    /**
     * heapBuffer 和 directByteBuffer的区别
     * <p>
     * HeapBuffer -- java堆内存，读写效率较低，收到GC的影响
     * DirectByteBuffer， --- 直接内存，读写效率高（少一次copy），不会受到GC的影响。分配效率低一些，而且如果使用不当可能会造成memory leak。
     *
     * @param args
     */
    public static void main(String[] args) {


        ByteBuffer buffer = ByteBuffer.allocate(10);
        buffer.put(new byte[]{'a', 'b', 'c', 'd'});

        buffer.flip();

        ByteBuffer buffer1 = buffer.get(new byte[4]);

        System.out.println("buffer1.toString() = " + buffer1.toString());


        /**
         * mark  & reset
         * mark 就是做一个标记，记录一下position的位置
         * reset就是跳转到mark的位置。
         */
        buffer1.rewind();
        byte b = buffer1.get();
        System.out.println("b = " + (char)b);


        // get(i)
        // 不会改变读指针，直接按照索引读

    }
}
