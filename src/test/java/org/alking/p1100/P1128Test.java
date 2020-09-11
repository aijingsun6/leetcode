package org.alking.p1100;

import org.junit.Assert;
import org.junit.Test;

public class P1128Test {

    @Test
    public void test(){
        P1128 p1128 = new P1128();
        int[][] dominoes = {{1,2},{2,1},{3,4},{5,6}};
        int ret = p1128.numEquivDominoPairs(dominoes);
        Assert.assertEquals(1,ret);
    }
}
