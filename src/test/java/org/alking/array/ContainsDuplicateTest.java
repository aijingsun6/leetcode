package org.alking.array;

import org.junit.Assert;
import org.junit.Test;

public class ContainsDuplicateTest {

    @Test
    public void test(){
        int[] nums = {1,2,3,1};
        boolean ret = new ContainsDuplicate().containsDuplicate(nums);
        Assert.assertTrue(ret);
    }
}
