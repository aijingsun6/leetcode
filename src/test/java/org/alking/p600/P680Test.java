package org.alking.p600;

import org.junit.Assert;
import org.junit.Test;

public class P680Test {

    /**
     * cupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupucu
     */
    @Test
    public void test(){
        P680 p680 = new P680();
        String s = "aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga";
        boolean res = p680.validPalindrome(s);
        Assert.assertTrue(res);

    }
}
