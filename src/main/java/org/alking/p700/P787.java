package org.alking.p700;

import java.util.Arrays;

public class P787 {

    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        return findCheapestPriceBellman(n, flights, src, dst, k);
    }

    public int findCheapestPriceBellman(int n, int[][] flights, int src, int dst, int k) {

        int[][] dp = new int[n][k+1];
        for(int i = 0; i < n;i++){
            Arrays.fill(dp[i],-1);
        }
        Arrays.fill(dp[src],0);

        for(int i = 0; i < k+1;i++){
            for (int[] edge : flights) {
                int from = edge[0];
                int to = edge[1];
                int price = edge[2];
               if(i == 0 && from == src){
                   // 第一轮
                   dp[to][i] = price;
               }else if(i > 0 && dp[from][i-1] > -1){

                   if(dp[to][i] < 0){
                       dp[to][i] = dp[from][i-1] + price;
                   }else if(dp[to][i] > dp[from][i-1] + price){
                       dp[to][i] = dp[from][i-1] + price;
                   }

               }
            }
        }
        return dp[dst][k];
    }

}
