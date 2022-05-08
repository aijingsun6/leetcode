package org.alking.p1800;

public class P1848 {

    public int getMinDistance(int[] nums, int target, int start) {
        if(nums[start] == target){
            return 0;
        }
        // find left
        int min = -1;
        int i = start -1;
        while ( i >= 0 && nums[i]!= target){
            i --;
        }
        if(i >=0){
            min = start-i;
        }
        int j = start +1;
        while (j < nums.length && nums[j] != target){
            j ++;
        }
        if(j < nums.length){
            if(min < 0){
                min = j - start;
            }else{
                min = Math.min(min,j-start);
            }
        }
        return min;
    }
}
