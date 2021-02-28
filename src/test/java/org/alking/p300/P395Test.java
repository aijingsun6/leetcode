package org.alking.p300;

import org.junit.Assert;
import org.junit.Test;

public class P395Test {
    @Test
    public void test(){
        P395 p395 = new P395();
        String str = "aaabb";
        int k = 3;
        int result = p395.longestSubstring(str,k);
        Assert.assertEquals(3,result);

        str = "ababbc" ;
        k = 2;
        result = p395.longestSubstring(str,k);
        Assert.assertEquals(5,result);

    }
}
