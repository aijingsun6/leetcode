package org.alking.p1100;

import org.junit.Assert;
import org.junit.Test;

public class P1189Test {

    @Test
    public void test(){
        P1189 p1189 = new P1189();
        String s = "nlaebolko";
        int result = p1189.maxNumberOfBalloons(s);
        Assert.assertEquals(1,result);
    }
}
