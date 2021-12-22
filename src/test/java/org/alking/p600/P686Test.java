package org.alking.p600;

import org.junit.Assert;
import org.junit.Test;

public class P686Test {
    @Test
    public void test(){
        P686 p686 = new P686();
        String a = "abcd";
        String b = "abcdabcd";
        int result = p686.repeatedStringMatch(a,b);
        Assert.assertEquals(2,result);

        a = "abcd";
        b = "cdabcdab";
        result = p686.repeatedStringMatch(a,b);
        Assert.assertEquals(3,result);

        a = "a";
        b = "aa";
        result = p686.repeatedStringMatch(a,b);
        Assert.assertEquals(2,result);

        a = "abc";
        b = "xyz";
        result = p686.repeatedStringMatch(a,b);
        Assert.assertEquals(-1,result);
    }
}
