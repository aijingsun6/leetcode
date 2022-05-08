package org.alking.p100;

import org.junit.Assert;
import org.junit.Test;

public class P165Test {

    @Test
    public void test(){
        P165 p165 = new P165();
        String v1 = "1.0";
        String v2 = "1.0.0";
        int result = p165.compareVersion(v1,v2);
        Assert.assertEquals(0,result);
    }
}
