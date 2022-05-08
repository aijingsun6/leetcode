package org.alking.p400;

public class P495 {

    public int findPoisonedDuration(int[] timeSeries, int duration) {

        if (timeSeries == null || timeSeries.length < 1) {
            return 0;
        }
        int acc = 0;
        for (int i = 1; i < timeSeries.length; i++) {
            int add = Math.min(duration, timeSeries[i] - timeSeries[i - 1]);
            acc += add;
        }
        acc += duration;
        return acc;
    }
}
