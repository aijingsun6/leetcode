package org.alking.p400;

import org.junit.Assert;
import org.junit.Test;

public class P421Test {

    @Test
    public void test() {
        P421 p421 = new P421();
        int[] nums = new int[]{2, 4};
        int result = p421.findMaximumXOR(nums);
        int expect = 6;
        Assert.assertEquals(expect, result);

        nums = new int[]{8, 10, 2};
        result = p421.findMaximumXOR(nums);
        expect = 10;
        Assert.assertEquals(expect, result);

        nums = new int[]{3, 10, 5, 25, 2, 8};
        result = p421.findMaximumXOR(nums);
        expect = 28;
        Assert.assertEquals(expect, result);

        nums = new int[]{14,70,53,83,49,91,36,80,92,51,66,70};
        result = p421.findMaximumXOR(nums);
        expect = 127;
        Assert.assertEquals(expect, result);
    }
}
