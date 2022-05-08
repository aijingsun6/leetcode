package org.alking.p300;

import java.util.ArrayList;
import java.util.Arrays;

public class P313 {

    public int nthSuperUglyNumber(int n, int[] primes) {

        if (n < 2) {
            return 1;
        }

        Arrays.sort(primes);

        int[] dp = new int[n + 1];
        dp[1] = 1;

        final int N = primes.length;
        ;
        int[] ptr = new int[N];
        Arrays.fill(ptr, 1);

        for (int i = 2; i <= n; i++) {
            int min = Integer.MAX_VALUE;
            ArrayList<Integer> idxList = new ArrayList<>();
            for (int j = 0; j < N; j++) {
                int v = dp[ptr[j]] * primes[j];
                if (v < min) {
                    min = v;
                    idxList.clear();
                    idxList.add(j);
                }else if(v == min){
                    idxList.add(j);
                }
            }
            dp[i] = min;
            for(int idx: idxList){
                ptr[idx] ++;
            }
        }
        return dp[n];

    }
}
