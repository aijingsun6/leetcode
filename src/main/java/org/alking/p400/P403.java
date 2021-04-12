package org.alking.p400;


import java.util.ArrayList;


public class P403 {

    public boolean canCross(int[] stones) {
        if (stones.length  < 2){
            return true;
        }
        if(stones[1] > 1){
            return false;
        }
        int size = stones.length;
        ArrayList<Integer>[] dp = new ArrayList[size];
        for(int i  =0 ; i < size; i++){
            dp[i] = new ArrayList<>();
        }

        dp[0].add(0);
        for(int i = 0; i < size-1;i++){
            ArrayList<Integer> q = dp[i];
            if (q == null || q.isEmpty()){
                continue;
            }
            // 双指针
            int idx = q.size() -1;
            int j = i + 1;
            int step;
            int gap;
            while (idx >= 0 && j < size){
                // step 由小变大
                // gap 由小变大
                step = q.get(idx);
                gap = stones[j] - stones[i];
                if(step < (gap-1)){
                    idx --;
                }else if(step > (gap+1)){
                    j ++;
                }else {
                    if (j == size -1){
                        return true;
                    }
                    dp[j].add(gap);
                    j++;
                }
            }
        }
        return dp[size-1] != null && !dp[size-1].isEmpty();
    }


}
