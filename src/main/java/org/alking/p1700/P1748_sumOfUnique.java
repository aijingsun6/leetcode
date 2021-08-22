package org.alking.p1700;

public class P1748_sumOfUnique {

    public int sumOfUnique(int[] nums) {
        int[] bucket = new int[101];
        for(int v : nums){
            bucket[v] ++;
        }
        int sum =0;
        for(int i = 0; i < bucket.length;i++){
            if(bucket[i] == 1){
                sum += i;
            }
        }
        return sum;
    }
}
