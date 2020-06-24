package org.alking.queue;

import org.junit.Assert;
import org.junit.Test;

public class EvalRPNTest {

    @Test
    public void test(){

        EvalRPN rpn = new EvalRPN();

        String[] tokens = {
                "2", "1", "+", "3", "*"
        };
        int result = rpn.evalRPN(tokens);
        Assert.assertEquals(9,result);

        tokens  = new String[]{"4", "13", "5", "/", "+"};
        result = rpn.evalRPN(tokens);
        Assert.assertEquals(6,result);

    }
}
