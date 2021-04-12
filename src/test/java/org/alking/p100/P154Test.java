package org.alking.p100;

import org.junit.Assert;
import org.junit.Test;

public class P154Test {

    @Test
    public void test(){
        P154 p154 = new P154();
        int[] nums = new int[]{1,3,5};
        int result = p154.findMin(nums);
        Assert.assertEquals(1,result);

        nums = new int[]{2,2,2,0,1};
        result = p154.findMin(nums);
        Assert.assertEquals(0,result);
    }
}
