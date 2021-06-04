package org.alking.p1700;

import java.util.Arrays;

public class P1725 {

    public int countGoodRectangles(int[][] rectangles) {

        int N = rectangles.length;
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = Math.min(rectangles[i][0], rectangles[i][1]);
        }
        Arrays.sort(nums);
        int acc = 0;
        for (int i = N - 1; i >= 0; i--) {
            if(nums[i] < nums[N-1]){
                break;
            }
            acc +=1;
        }
        return acc;

    }
}
