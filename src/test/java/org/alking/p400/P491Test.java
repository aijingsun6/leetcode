package org.alking.p400;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class P491Test {

    @Test
    public void findTest(){
        P491 p491 = new P491();
        long start = System.currentTimeMillis();
        int[] nums = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        List<List<Integer>> acc = p491.findSubsequences(nums);
        long end = System.currentTimeMillis();
        System.out.println(String.format("cost: %d ms",(end - start)));
    }
}
