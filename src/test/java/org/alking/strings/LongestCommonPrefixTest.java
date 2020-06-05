package org.alking.strings;

import org.junit.Assert;
import org.junit.Test;

public class LongestCommonPrefixTest {

    @Test
    public void longestCommonPrefixTest(){

        LongestCommonPrefix lcp = new LongestCommonPrefix();
        Assert.assertEquals("fl",lcp.longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }
}
