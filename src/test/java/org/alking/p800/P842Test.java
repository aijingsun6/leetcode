package org.alking.p800;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class P842Test {

    @Test
    public void test(){
        P842 p842 = new P842();
        String s = "123456579";
        List<Integer> result = p842.splitIntoFibonacci(s);
        Assert.assertEquals(3,result.size());
        s = "11235813";
        result = p842.splitIntoFibonacci(s);
        Assert.assertEquals(7,result.size());

        s = "1011";
        result = p842.splitIntoFibonacci(s);
        Assert.assertEquals(4,result.size());

        s = "0123";
        result = p842.splitIntoFibonacci(s);
        Assert.assertEquals(0,result.size());

    }
}
