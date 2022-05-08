package org.alking.p500;

import org.junit.Assert;
import org.junit.Test;

public class P518Test {

    @Test
    public void test(){
        P518 p518 = new P518();
        int amount = 5;
        int[] coins = new int[]{1,2,5};
        int result = p518.change(amount,coins);
        int expect = 4;
        Assert.assertEquals(expect,result);

        amount = 3;
        coins = new int[]{2};
        result = p518.change(amount,coins);
        expect = 0;
        Assert.assertEquals(expect,result);


        amount = 10;
        coins = new int[]{10};
        result = p518.change(amount,coins);
        expect = 1;
        Assert.assertEquals(expect,result);

        amount = 10;
        coins = new int[]{1,10};
        result = p518.change(amount,coins);
        expect = 2;
        Assert.assertEquals(expect,result);

    }
}
