package org.alking.p300;

import java.util.Arrays;
import java.util.Comparator;

public class P354 {

    public int maxEnvelopes(int[][] envelopes) {
        if(envelopes == null || envelopes.length < 1){
            return 0;
        }
        if(envelopes.length < 2){
            return 1;
        }
        Arrays.sort(envelopes, new Comparator<int[]>() {
            @Override
            public int compare(int[] e1, int[] e2) {
                if (e1[0] != e2[0]) {
                    return e1[0] - e2[0];
                } else {
                    return e2[1] - e1[1];
                }
            }
        });
        int[] dp = new int[envelopes.length];
        Arrays.fill(dp, 1);
        int max = 1;
        for (int i = 1; i < envelopes.length; i++) {
            int n = 0;
            for (int j = 0; j < i; j++) {
                if (envelopes[j][1] < envelopes[i][1]) {
                    n = Math.max(n, dp[j]);
                }
            }
            n = n + 1;
            dp[i] = n;
            max = Math.max(max, n);

        }
        return max;
    }

}
