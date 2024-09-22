package org.alking.leetcode.p900;

import org.junit.Assert;
import org.junit.Test;

public class P997Test {

    @Test
    public void test(){
        P997 p997 = new P997();
        int n  = 2;
        int[][] trust = new int[][]{{1,2}};
        int r = p997.findJudge(n, trust);
        int e = 2;
        Assert.assertEquals(e, r);
        n = 3;
        trust = new int[][]{{1,3},{2,3}};
        r = p997.findJudge(n, trust);
        e = 3;
        Assert.assertEquals(e, r);

        n = 3;
        trust = new int[][]{{1,3},{2,3},{3,1}};
        r = p997.findJudge(n, trust);
        e = -1;
        Assert.assertEquals(e, r);

        n = 4;
        trust = new int[][]{{1,3},{1,4},{2,3},{2,4},{3,4}};
        r = p997.findJudge(n, trust);
        e = 4;
        Assert.assertEquals(e, r);
    }
}
