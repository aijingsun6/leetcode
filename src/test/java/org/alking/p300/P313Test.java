package org.alking.p300;

import org.junit.Assert;
import org.junit.Test;

public class P313Test {

    @Test
    public void test(){
        P313 p313 = new P313();
        int n = 12;
        int[] primes = new int[]{2,7,13,19};
        int result = p313.nthSuperUglyNumber(n,primes);
        Assert.assertEquals(32,result);
        n = 15;
        primes = new int[]{3,5,7,11,19,23,29,41,43,47};
        result = p313.nthSuperUglyNumber(n,primes);
        Assert.assertEquals(35,result);
    }
}
