package org.alking.queue;

public class MyCircularQueue {

    private int[] elements;

    private int start = 0;

    private int end = 0;

    private int size;

    public MyCircularQueue(int k) {
        elements = new int[k];
        this.size = k;
    }

    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }

        elements[end % size] = value;
        end = end + 1;
        return true;
    }

    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        start += 1;
        return true;
    }

    public int Front() {
        if(isEmpty()){
            return -1;
        }
        return elements[start % size];
    }

    public int Rear() {
        if(isEmpty()){
            return -1;
        }
        int idx = (end -1) % size;
        return elements[idx];
    }

    public boolean isEmpty() {
        return end == start;
    }

    public boolean isFull() {
        if (end > start && (end - start == size)) {
            return true;
        }
        return false;
    }
}
