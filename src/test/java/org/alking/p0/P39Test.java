package org.alking.p0;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class P39Test {

    @Test
    public void test() {

        P39 p39 = new P39();
        int[] candidates = {2,3,6,7};
        List<List<Integer>> acc = p39.combinationSum(candidates,7);
        Assert.assertEquals(2,acc.size());
    }
}
