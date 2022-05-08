package org.alking.p1000;

import org.junit.Assert;
import org.junit.Test;

public class P1021Test {

    @Test
    public void test(){
        P1021 p1021 = new P1021();
        String s = "(()())(())";
        String result = p1021.removeOuterParentheses(s);
        String expect = "()()()";
        Assert.assertEquals(expect,result);

        s = "(()())(())(()(()))";
        result = p1021.removeOuterParentheses(s);
        expect = "()()()()(())";
        Assert.assertEquals(expect,result);

    }
}
