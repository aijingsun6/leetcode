package org.alking.p2100;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class P2100Test {

    @Test
    public void test() {
        P2100 p2100 = new P2100();
        int[] sec = new int[]{5,3,3,3,5,6,2};
        int time = 2;
        List<Integer> ret = p2100.goodDaysToRobBank(sec,time);
        Assert.assertEquals(2,ret.size());
        Assert.assertEquals(2L,(long)ret.get(0));
        Assert.assertEquals(3L,(long)ret.get(1));

        sec = new int[]{1,2,3,4,5,6};
        time = 2;
        ret = p2100.goodDaysToRobBank(sec,time);
        Assert.assertEquals(0,ret.size());
    }
}
