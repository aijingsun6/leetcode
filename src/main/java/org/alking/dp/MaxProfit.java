package org.alking.dp;

public class MaxProfit {

    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int min = prices[0];
        int max = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            int v = prices[i];
            if (v > max) {
                max = v;
                profit = Math.max(profit, v - min);
            } else if (v < min) {
                min = v;
            } else if (v - min > profit) {
                profit = v - min;
            }
        }

        return profit;
    }
}
