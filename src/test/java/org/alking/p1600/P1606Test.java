package org.alking.p1600;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class P1606Test {

    @Test
    public void test() {
        P1606 p1606 = new P1606();
        int k = 3;
        int[] arrival = new int[]{1,2,3,4,5};
        int[] load = new int[]{5,2,3,3,3};
        List<Integer> result = p1606.busiestServers(k,arrival,load);
        Assert.assertEquals(1, result.size());
        Assert.assertEquals(new Integer(1), result.get(0));
    }
}
