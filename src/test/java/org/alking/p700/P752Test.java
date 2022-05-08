package org.alking.p700;

import org.junit.Assert;
import org.junit.Test;

public class P752Test {
    @Test
    public void test(){

        String[] deadends = new String[]{"0201","0101","0102","1212","2002"};
        String target="0202";
        P752 p752 = new P752();
        int result = p752.openLock(deadends,target);
        int expect = 6;
        Assert.assertEquals(expect,result);

        deadends = new String[]{"8888"};
        target = "0009";
        result = p752.openLock(deadends,target);
        expect = 1;
        Assert.assertEquals(expect,result);

        deadends = new String[]{"0201","0101","0102","1212","2002"};
        target = "0000";
        result = p752.openLock(deadends,target);
        expect = 0;
        Assert.assertEquals(expect,result);
    }
}
