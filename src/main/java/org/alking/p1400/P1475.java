package org.alking.p1400;

public class P1475 {

    public int[] finalPrices(int[] prices) {

        int[] result = new int[prices.length];
        for (int idx = 0; idx < prices.length; idx++) {
            int discount = 0;
            for(int i = idx +1; i < prices.length;i++){
                if(prices[i] <= prices[idx]){
                    discount = prices[i];
                    break;
                }
            }
            result[idx] = prices[idx]-discount;
        }
        return result;

    }
}
