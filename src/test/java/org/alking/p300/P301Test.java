package org.alking.p300;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class P301Test {

    @Test
    public void test() {
        P301 p301 = new P301();

        String s = ")(";
        List<String> result = p301.removeInvalidParentheses(s);
        Assert.assertEquals(1, result.size());

        s = "()())()";
        result = p301.removeInvalidParentheses(s);
        Assert.assertEquals(2, result.size());

        s = "(a)())()";
        result = p301.removeInvalidParentheses(s);
        Assert.assertEquals(2, result.size());

    }
}
