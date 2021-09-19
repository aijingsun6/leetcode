package org.alking.p500;

import java.util.Arrays;

public class P517 {

    public int findMinMoves(int[] machines) {

        int sum = Arrays.stream(machines).sum();
        int N = machines.length;
        if (sum % N > 0) {
            return -1;
        }
        int ava = sum / N;
        for (int i = 0; i < N; i++) {
            machines[i] -= ava;
        }

        int result = 0;
        sum = 0;
        for(int i = 0; i < N; i++){
            int v = machines[i];
            sum += v;
            result = Math.max(result,Math.abs(v));
            result = Math.max(result,Math.abs(sum));
        }
        return result;
    }



}
