package org.alking.math;

import org.junit.Assert;
import org.junit.Test;

public class IsPowerOfThreeTest {

    @Test
    public void isPowerOfThreeTest(){
        IsPowerOfThree ipot = new IsPowerOfThree();
        Assert.assertTrue(ipot.isPowerOfThree(27));
    }
}
