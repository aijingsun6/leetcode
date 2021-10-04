package org.alking.p400;

import org.junit.Assert;
import org.junit.Test;

public class P482Test {

    @Test
    public void test(){
        P482 p482  = new P482();
        String res = p482.licenseKeyFormatting2("5F3Z-2e-9-w",4);
        Assert.assertEquals("5F3Z-2E9W",res);

        res = p482.licenseKeyFormatting2("2-5g-3-J",2);
        Assert.assertEquals("2-5G-3J",res);
    }
}
