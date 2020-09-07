package org.alking.p300;

import org.junit.Assert;
import org.junit.Test;

public class P347Test {

    @Test
    public void test(){
        P347 p347 = new P347();
        int[] nums = new int[]{1,1,1,2,2,3};
        int[] ret = p347.topKFrequent(nums,2);
        Assert.assertArrayEquals(new int[]{1,2},ret);
    }
}
