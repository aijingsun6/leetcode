package org.alking.p800;

import org.junit.Assert;
import org.junit.Test;

public class P856Test {

    @Test
    public void test(){
        P856 p856 = new P856();
        int result = p856.scoreOfParentheses("()");
        Assert.assertEquals(1,result);

        result = p856.scoreOfParentheses("()()");
        Assert.assertEquals(2,result);

        result = p856.scoreOfParentheses("(())");
        Assert.assertEquals(2,result);

        result = p856.scoreOfParentheses("(()(()))");
        Assert.assertEquals(6,result);
    }
}
