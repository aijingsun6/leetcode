package org.alking.p1400;

public class P1422 {

    public int maxScore(String s) {
        final int N = s.length();
        int[] oneArr = new int[N + 1];
        int[] zeroArr = new int[N + 1];
        int oneSum = 0;
        int zeroSum = 0;
        for (int i = 0; i < N; i++) {
            if (s.charAt(i) == '0') {
                zeroSum += 1;
            } else {
                oneSum += 1;
            }
            oneArr[i + 1] = oneSum;
            zeroArr[i + 1] = zeroSum;
        }

        int max = 0;
        for (int i = 1; i < N; i++) {

            int v = zeroArr[i] - zeroArr[0] + (oneArr[N] - oneArr[i]);
            max = Math.max(max, v);
        }
        return max;
    }
}
