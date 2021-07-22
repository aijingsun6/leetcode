package org.alking.p0;

public class P55 {

    public boolean canJump(int[] nums) {

        final int N = nums.length;
        final int target = N - 1;

        boolean[] visit = new boolean[N];
        visit[0] = true;

        for (int i = 0; i < N; i++) {
            if(visit[i]){
                int start = i + 1;
                int end = i + nums[i];
                if (end >= target){
                    return true;
                }
                for(int j = start; j <= end;j++){
                    visit[j] = true;
                }
            }
        }
        return false;
    }
}
