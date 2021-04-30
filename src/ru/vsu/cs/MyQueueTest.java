package ru.vsu.cs;

import org.junit.Assert;
import org.junit.Test;

public class MyQueueTest {

    @Test
    public void add() {
        MyQueue<Integer> myQueue = new MyQueue<>(1);
        myQueue.add(5);
        int testSize = 1;
        Assert.assertEquals(testSize, myQueue.getSize());
    }

    @Test
    public void peek() {
        MyQueue<Integer> myQueue = new MyQueue<>(2);
        myQueue.add(6);
        myQueue.add(7);
        int testNumber = 7;
        int firstQueueNumber = myQueue.peek();
        Assert.assertEquals(testNumber, firstQueueNumber);
    }

    @Test
    public void poll() {
        MyQueue<Integer> myQueue = new MyQueue<>(2);
        myQueue.add(6);
        myQueue.add(7);
        int testNumber = 6;
        int testSize = 1;
        int firstQueueNumber = myQueue.poll();
        Assert.assertEquals(testNumber, firstQueueNumber);
        Assert.assertEquals(testSize, myQueue.getSize());
    }

    @Test
    public void isEmpty() {
        MyQueue<Integer> myQueue = new MyQueue<>(10);
        int queueSize = myQueue.getSize();
        for (int i = 0; i < queueSize; i++) {
            myQueue.add(i);
        }

        for (int i = 0; i < queueSize; i++) {
            int n = myQueue.poll();
        }

        Assert.assertEquals(0, myQueue.getSize());
    }

    @Test
    public void getCapacity() {
        MyQueue<Integer> myQueue = new MyQueue<>(2);
        myQueue.add(5);
        myQueue.add(6);
        myQueue.add(6);
        int testSize = 4;
        Assert.assertEquals(testSize, myQueue.getMaxSize());
    }
}