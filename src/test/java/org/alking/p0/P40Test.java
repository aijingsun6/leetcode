package org.alking.p0;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class P40Test {

    @Test
    public void test(){
        P40 p40 = new P40();
        int[] candidates= {10,1,2,7,6,1,5};
        List<List<Integer>> ret = p40.combinationSum2(candidates,8);
        Assert.assertEquals(4, ret.size());
    }
}
