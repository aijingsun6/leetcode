package org.alking.p1600;

public class P1652 {

    public int[] decrypt(int[] code, int k) {

        int N = code.length;
        int[] acc = new int[N];
        if (k == 0) {
            return acc;
        }

        // p = abs(k)
        int p = Math.abs(k);

        // sumArray[i] 从 下标 i 开始往后 k个数字的和
        int[] sumArray = new int[N];
        int sum = 0;
        for (int i = 0; i < p; i++) {
            sum += code[i];
        }
        sumArray[0] = sum;
        for (int i = 1; i < N; i++) {
            sum = sum + code[(i + p-1) % N] - code[i - 1];
            sumArray[i] = sum;
        }

        if (k > 0) {
            for (int i = 0; i < N; i++) {
                acc[i] = sumArray[(i + 1) % N];
            }
        } else {
            for (int i = 0; i < N; i++) {
                acc[i] = sumArray[(N + i - p) % N];
            }
        }
        return acc;
    }

}
