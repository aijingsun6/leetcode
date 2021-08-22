package org.alking.p200;

import org.junit.Assert;
import org.junit.Test;

public class P217Test {

    @Test
    public void test(){
        P217 p217 = new P217();
        int[] nums = new int[]{1,2,3,1};
        boolean result = p217.containsDuplicate(nums);
        Assert.assertTrue(result);
    }
}
