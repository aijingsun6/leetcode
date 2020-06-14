package org.alking.other;

import org.junit.Assert;
import org.junit.Test;

public class HammingWeightTest {

    @Test
    public void hammingWeightTest(){
        System.out.println(Integer.toBinaryString(2));
        HammingWeight hw = new HammingWeight();
        Assert.assertEquals(3,hw.hammingWeight(11));
        Assert.assertEquals(1,hw.hammingWeight(256));
        //parseInt("1100110", 2) returns 102
        // Assert.assertEquals(102L,(long)Integer.parseInt("1100110",2));
        // -3 = 11111111111111111111111111111101
        // 11111111
        // 11111111
        // 11111111
        // 11111101
        // Assert.assertEquals(-3L,(long)Integer.parseInt("11111111111111111111111111111101",2));
        Assert.assertEquals(31,hw.hammingWeight(-3));
        hw.hammingWeight(Integer.parseInt("111111111111111111111111111",2));

    }
}
