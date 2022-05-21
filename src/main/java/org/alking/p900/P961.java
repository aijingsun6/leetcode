package org.alking.p900;

import java.util.HashSet;
import java.util.Set;

public class P961 {

    public int repeatedNTimes(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int v: nums){
            if(set.contains(v)){
                return v;
            }
            set.add(v);
        }
        return -1;
    }
}
