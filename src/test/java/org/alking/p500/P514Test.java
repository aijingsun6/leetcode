package org.alking.p500;

import org.junit.Assert;
import org.junit.Test;

public class P514Test {

    @Test
    public void test(){
        P514 p514 = new P514();
        int res = p514.findRotateSteps("godding","gd");
        Assert.assertEquals(4,res);

        res = p514.findRotateSteps("abcde","ade");
        Assert.assertEquals(6,res);
    }
}
