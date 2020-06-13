package org.alking.strings;

import org.junit.Assert;
import org.junit.Test;

public class String2IntTest {

    @Test
    public void myAtoiTest(){

        String2Int s2i = new String2Int();


        Assert.assertEquals(4193,s2i.myAtoi("4193 with words"));
        Assert.assertEquals(0,s2i.myAtoi("words and 987"));
        Assert.assertEquals(Integer.MIN_VALUE,s2i.myAtoi("-91283472332"));
    }
}
