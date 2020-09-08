package org.alking.p0;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class P77Test {

    @Test
    public void test(){

        P77 p77 = new P77();
        List<List<Integer>> ret = p77.combine(4,2);
        Assert.assertEquals(6, ret.size());

    }
}
