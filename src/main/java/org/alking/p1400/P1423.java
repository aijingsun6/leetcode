package org.alking.p1400;

public class P1423 {

    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int[] sumArr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += cardPoints[i];
            sumArr[i] = sum;
        }
        int min = sumArr[n - 1];
        for (int i = 0; i < k; i++) {
            min = Math.min(min, sumArr[i + n - k] - sumArr[i]+cardPoints[i]);
        }
        return sumArr[n - 1] - min;
    }
}
