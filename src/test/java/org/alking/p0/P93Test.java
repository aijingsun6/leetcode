package org.alking.p0;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class P93Test {

    @Test
    public void test(){
        P93 p93 = new P93();
        String s = "25525511135";
        List<String> result = p93.restoreIpAddresses(s);
        Assert.assertEquals(2,result.size());

        s = "0000";
        result = p93.restoreIpAddresses(s);
        Assert.assertEquals(1,result.size());

        s = "1111";
        result = p93.restoreIpAddresses(s);
        Assert.assertEquals(1,result.size());

        s = "010010";
        result = p93.restoreIpAddresses(s);
        Assert.assertEquals(2,result.size());

        s  = "101023";
        result = p93.restoreIpAddresses(s);
        Assert.assertEquals(5,result.size());

    }
}
