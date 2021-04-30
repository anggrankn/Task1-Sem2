package ru.vsu.cs;

public interface RingQueue<T> {
    void add(T value);
    T peek();
    T poll();
    boolean isEmpty();
    boolean isFull();

}
