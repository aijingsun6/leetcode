package org.alking.p1100;

import org.junit.Assert;
import org.junit.Test;

public class P1170Test {

    @Test
    public void test(){

        P1170 p1170 = new P1170();
        String[] query = new String[]{"bbb","cc"};
        String[] words = new String[]{"a","aa","aaa","aaaa"};
        int[] result = p1170.numSmallerByFrequency(query,words);
        Assert.assertArrayEquals(new int[]{1,2},result);

    }
}
