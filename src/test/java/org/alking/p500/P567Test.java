package org.alking.p500;

import org.junit.Assert;
import org.junit.Test;

public class P567Test {

    @Test
    public void test(){
        P567 p567 = new P567();
        String s1 = "ab";
        String s2 = "eidbaooo";
        boolean ret = p567.checkInclusion(s1,s2);
        Assert.assertTrue(ret);

        s2 = "eidboaoo";
        ret = p567.checkInclusion(s1,s2);
        Assert.assertFalse(ret);
    }
}
