package org.alking.p1300;


import java.util.Arrays;

public class P1334 {


    public int findTheCity(int n, int[][] edges, int distanceThreshold) {

        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
            dp[i][i] = 0;
        }

        // floyd
        for (int no = 0; no < n; no++) {

            for (int[] e : edges) {
                int x = e[0];
                int y = e[1];
                int dist = e[2];

                if (dp[x][y] < 0 || dist < dp[x][y]) {
                    dp[x][y] = dist;
                }

                if (dp[y][x] < 0 || dist < dp[y][x]) {
                    dp[y][x] = dist;
                }

                for (int j = 0; j < n; j++) {
                    //（y,j)
                    if (dp[x][j] > -1 && (dp[y][j] < 0 || dp[x][j] + dist < dp[y][j])) {
                        dp[y][j] = dp[x][j] + dist;
                    }
                    if (dp[y][j] > -1 && (dp[x][j] < 0 || dp[y][j] + dist < dp[x][j])) {
                        dp[x][j] = dp[y][j] + dist;
                    }
                }
            }
        }
        int num = Integer.MAX_VALUE;
        int city = 0;
        for (int i = 0; i < n; i++) {

            int acc = 0;
            for (int j = 0; j < n; j++) {
                if (j != i && dp[i][j] <= distanceThreshold) {
                    acc += 1;
                }
            }
            if(acc < num){
                city = i;
                num = acc;
            }else if (acc == num){
                city = Math.max(city, i);
            }
        }
        return city;
    }


}
