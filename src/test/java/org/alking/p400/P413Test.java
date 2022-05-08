package org.alking.p400;

import org.junit.Assert;
import org.junit.Test;

public class P413Test {

    @Test
    public void test(){
        P413 p413 = new P413();
        int[] nums = new int[]{1,2,3,4};
        int result = p413.numberOfArithmeticSlices(nums);
        Assert.assertEquals(3, result);

        nums = new int[]{1};
        result = p413.numberOfArithmeticSlices(nums);
        Assert.assertEquals(0, result);
    }
}
