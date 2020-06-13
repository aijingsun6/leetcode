package org.alking.design;

public class MinStack {

    private int size = 16;

    private int[] arr = new int[size];

    private int topPtr = -1;

    private int min = Integer.MAX_VALUE;

    public MinStack() {

    }

    public void push(int x) {
        if (topPtr < 0) {
            topPtr = 0;
            arr[topPtr] = x;
        } else if (topPtr == size - 1) {
            int sizeNew = size * 2;
            int[] arrNew = new int[sizeNew];
            System.arraycopy(arr, 0, arrNew, 0, size);
            arr = arrNew;
            size = sizeNew;
            arr[++topPtr] = x;
        } else {
            arr[++topPtr] = x;
        }
        min = Math.min(min, x);

    }

    public void pop() {
        if(topPtr < 0){
            return;
        }
        topPtr--;
        min = Integer.MAX_VALUE;
        for (int i = 0; i <= topPtr; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

    }

    public int top() {
        if(topPtr < 0){
            return 0;
        }
        return arr[topPtr];
    }

    public int getMin() {
        if(topPtr < 0){
            return Integer.MAX_VALUE;
        }
        return min;
    }
}
