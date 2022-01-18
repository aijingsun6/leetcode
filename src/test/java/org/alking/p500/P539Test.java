package org.alking.p500;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class P539Test {

    @Test
    public void test(){
        P539 p539 = new P539();
        List<String> timePoints  = Arrays.asList("00:00","23:59","00:00");
        int res = p539.findMinDifference(timePoints);
        Assert.assertEquals(0,res);
    }
}
