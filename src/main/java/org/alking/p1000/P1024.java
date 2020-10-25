package org.alking.p1000;

import java.util.Arrays;
import java.util.Comparator;


public class P1024 {

    public int videoStitching(int[][] clips, int target) {
        if (clips == null || clips.length == 0) {
            return -1;
        }
        // 第一步排序，如果第一位相同，第二位大的排前面。
        Arrays.sort(clips, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]) {
                    return o2[1] - o1[1];
                }
                return o1[0] - o2[0];
            }
        });

        if (clips[0][0] > 0) {
            return -1;
        }

        int[] dp = new int[target + 1];
        int last = 0;
        for (int[] clip : clips) {
            int from = clip[0];
            int to = clip[1];
            if (from == 0) {
                if (to >= target) {
                    return 1;
                }
                last = Math.max(last, to);
                Arrays.fill(dp, from, last+1, 1);
                continue;
            }
            if (last < from) {
                //接不上了
                return -1;
            }
            if(to <= last){
                // 已经被覆盖了
                continue;
            }
            int min = dp[from];
            int idx = from;
            for (int i = from + 1; i <= last; i++) {
                if (dp[i] < min) {
                    min = dp[i];
                    idx = i;
                }
            }
            if (to >= target) {
                return min + 1;
            }
            for (int i = idx + 1; i <= last; i++) {
                dp[i] = Math.min(dp[i], min + 1);
            }
            for (int i = last + 1; i <= to; i++) {
                dp[i] = min + 1;
            }
            last = to;
        }
        return dp[target] == 0 ? -1 : dp[target];
    }

}
