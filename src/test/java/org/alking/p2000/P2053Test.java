package org.alking.p2000;

import org.junit.Assert;
import org.junit.Test;

public class P2053Test {

    @Test
    public void test(){
        P2053 p2053 = new P2053();
        String[] arr = new String[]{"d","b","c","b","c","a"};
        int k = 2;
        String result = p2053.kthDistinct(arr,k);
        Assert.assertEquals("a",result);

        arr = new String[]{"aaa","aa","a"};
        k = 1;
        result = p2053.kthDistinct(arr,k);
        Assert.assertEquals("aaa",result);

        arr = new String[]{"a","b","a"};
        k = 3;
        result = p2053.kthDistinct(arr,k);
        Assert.assertEquals("",result);

    }
}
