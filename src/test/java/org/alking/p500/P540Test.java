package org.alking.p500;

import org.junit.Assert;
import org.junit.Test;

public class P540Test {

    @Test
    public void test(){
        P540 p540 = new P540();
        int[] nums = new int[]{1,1,2,3,3,4,4,8,8};
        int res = p540.singleNonDuplicate(nums);
        Assert.assertEquals(2,res);
        nums = new int[]{3,3,7,7,10,11,11};
        res = p540.singleNonDuplicate(nums);
        Assert.assertEquals(10,res);

        nums = new int[]{1,1,2};
        res = p540.singleNonDuplicate(nums);
        Assert.assertEquals(2,res);

        nums = new int[]{1,2,2,3,3};
        res = p540.singleNonDuplicate(nums);
        Assert.assertEquals(2,res);
    }
}
