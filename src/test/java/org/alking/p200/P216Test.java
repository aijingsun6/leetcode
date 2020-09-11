package org.alking.p200;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class P216Test {

    @Test
    public void test(){

        P216 p216 = new P216();
        List<List<Integer>> acc = p216.combinationSum3(3,7);
        Assert.assertEquals(1,acc.size());

        acc = p216.combinationSum3(3,9);
        Assert.assertEquals(3,acc.size());
    }
}
