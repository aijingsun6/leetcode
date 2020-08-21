package org.alking.p1300;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class P1317Test {

    @Test
    public void test(){
        P1317 p1317 = new P1317();
        int[] ar = p1317.getNoZeroIntegers(2);
        Assert.assertEquals(1,ar[0]);
        Assert.assertEquals(1,ar[1]);
        ar = p1317.getNoZeroIntegers(11);
        Assert.assertEquals(5,ar[0]);
        Assert.assertEquals(6,ar[1]);

        ar = p1317.getNoZeroIntegers(10000);
        Assert.assertFalse(containsZero(ar[0]));
        Assert.assertFalse(containsZero(ar[1]));

        ar = p1317.getNoZeroIntegers(69);
        Assert.assertFalse(containsZero(ar[0]));
        Assert.assertFalse(containsZero(ar[1]));


        ar = p1317.getNoZeroIntegers(474748);
        Assert.assertFalse(containsZero(ar[0]));
        Assert.assertFalse(containsZero(ar[1]));


    }

    private boolean containsZero(int n){
        String s = String.valueOf(n);
        return s.contains("0");
    }
}
