package org.alking.p1000;

import org.alking.p1100.P1190;
import org.junit.Assert;
import org.junit.Test;

public class P1190Test {

    @Test
    public void test(){
        P1190 p1190 = new P1190();
        String s= "(abcd)";
        String result = p1190.reverseParentheses(s);
        Assert.assertEquals("dcba",result);

        s= "(u(love)i)";
        result = p1190.reverseParentheses(s);
        Assert.assertEquals("iloveu",result);

        s= "(ed(et(oc))el)";
        result = p1190.reverseParentheses(s);
        Assert.assertEquals("leetcode",result);

        s= "a(bcdefghijkl(mno)p)q";
        result = p1190.reverseParentheses(s);
        Assert.assertEquals("apmnolkjihgfedcbq",result);
    }
}
