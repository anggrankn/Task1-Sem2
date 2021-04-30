package ru.vsu.cs;

public class Main {

    public static void main(String[] args) throws Exception {
        MyQueue<Integer> myQueue = new MyQueue<>(5);
        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);
        myQueue.add(4);
        myQueue.add(5);
        myQueue.poll();
        myQueue.poll();
        myQueue.poll();
        myQueue.add(6);
        myQueue.add(7);
        myQueue.add(8);
        myQueue.add(9);

        System.out.println(myQueue.poll());
    }
}
