package org.alking.p1300;

import org.junit.Assert;
import org.junit.Test;

public class P1346Test {

    @Test
    public void test(){
        P1346 p1346 = new P1346();
        int[] arr = {-2,0,10,-19,4,6,-8};
        boolean ret = p1346.checkIfExist(arr);
        Assert.assertFalse(ret);
    }
}
