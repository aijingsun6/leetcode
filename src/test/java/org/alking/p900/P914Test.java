package org.alking.p900;

import org.junit.Assert;
import org.junit.Test;

public class P914Test {

    @Test
    public void test(){
        P914 p914 = new P914();
        int[] deck = new int[]{1,2,3,4,4,3,2,1};
        Assert.assertTrue(p914.hasGroupsSizeX(deck));
    }
}
