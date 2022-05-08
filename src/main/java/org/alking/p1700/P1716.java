package org.alking.p1700;

public class P1716 {

    private int calcPart(int start, int gap, int n) {
        if (n == 0) {
            return 0;
        }
        return start * n + (n - 1) * n * gap / 2;
    }

    public int totalMoney(int n) {
        int week = n / 7;
        int left = n % 7;

        return calcPart(28, 7, week) + calcPart(week+1, 1, left);
    }
}
