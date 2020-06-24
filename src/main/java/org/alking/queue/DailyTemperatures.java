package org.alking.queue;

import java.util.Stack;

public class DailyTemperatures {

    public int[] dailyTemperatures(int[] temps) {
        int[] result = new int[temps.length];
        for (int i = 0; i < temps.length; i++) {
            result[i] = 0;
        }
        Stack<Integer> idxStack = new Stack<>();
        Stack<Integer> tempStack = new Stack<>();
        for (int idx = 0; idx < temps.length; idx++) {
            int temp = temps[idx];
            if (!tempStack.isEmpty()) {
                Integer top = tempStack.peek();
                while (temp > top) {
                    int idxPeek = idxStack.peek();
                    result[idxPeek] = idx - idxPeek;
                    tempStack.pop();
                    idxStack.pop();

                    if (tempStack.isEmpty()) {
                        break;
                    } else {
                        top = tempStack.peek();
                    }
                }
            }
            tempStack.push(temp);
            idxStack.push(idx);
        }
        return result;

    }
}
