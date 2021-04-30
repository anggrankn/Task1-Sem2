package ru.vsu.cs;

public class MyQueue<T> implements RingQueue<T> {
    private T[] items;
    private int front;
    private int back;
    private int maxSize;
    private int size;

    public MyQueue(int maxSize) {
        this.front = -1;
        this.back = -1;
        this.items = (T[]) new Object[10];
        this.maxSize = maxSize;
    }

    @Override
    public void add(T value) {
        if (isFull()) {
            expandSize();
        }
        if (isEmpty()) {
            front++;
        }
        back = (back + 1) % maxSize;
        items[back] = value;
        size++;
    }

    @Override
    public T peek() {
        return items[back];
    }

    @Override
    public T poll() {
        T value;
        if (isEmpty()) {
            return null;
        } else {
            value = items[front];
            if (front == back) {
                front = -1;
                back = -1;
            } else {
                front = (front + 1) % maxSize;
            }
        }
        size--;
        return value;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return maxSize == size;
    }

    private void expandSize() {
        T[] newArray = (T[]) new Object[size * 2];
        if (front < back) {
            for (int i = 0; i < back - front + 1; i++) {
                newArray[i] = items[front + i];
            }
        } else {
            for (int i = 0; i < size - front; i++) {
                newArray[i] = items[front + i];
            }
            for (int i = 0; i < size - front + 1; i++) {
                newArray[size - front + i] = items[i];
            }
            front = 0;
            back = size - 1;
        }
        items = newArray;

        maxSize = newArray.length;
    }

    int getSize() {
        return this.size;
    }

    int getMaxSize() {
        return this.maxSize;
    }
}