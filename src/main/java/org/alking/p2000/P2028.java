package org.alking.p2000;

public class P2028 {

    public int[] missingRolls(int[] rolls, int mean, int n) {
        int sum = 0;
        for (int v : rolls) {
            sum += v;
        }
        int left = (rolls.length + n) * mean - sum;
        if (left < n || left > n * 6) {
            return new int[0];
        }

        int[] result = new int[n];
        int rem = left % n;
        int div = left / n;
        for (int i = 0; i < n; i++) {
            result[i] = div;
        }
        for (int i = 0; i < rem; i++) {
            result[i] += 1;
        }
        return result;
    }
}
