package org.alking.p600;

public class P645 {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int sum = n * (n + 1) / 2;
        boolean[] arr = new boolean[n + 1];
        int s = 0;
        int repeat = 0;
        for (int v : nums) {
            if(arr[v]){
                repeat = v;
            }else {
                arr[v] = true;
                s += v;
            }
        }
        return new int[]{repeat,sum - s};
    }


}
