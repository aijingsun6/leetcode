package org.alking.p100;

public class P137 {

    public int singleNumber(int[] nums) {
        return singleNumber(nums,3,1);
    }

    private int singleNumber(int[] nums,int m,int n){
        int[] arr = new int[32];
        for(int v : nums){
            int idx = 0;
            while ( v != 0){
                arr[idx] += v & 1;
                v = v >>> 1;
                idx ++;
            }
        }
        int result = 0;
        for(int i = 0; i < 32; i++){
            if (arr[i] %m == n) {
                result |= 1 << i;
            }
        }
        return result;
    }
}
