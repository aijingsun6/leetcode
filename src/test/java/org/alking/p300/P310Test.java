package org.alking.p300;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class P310Test {

    @Test
    public void test(){

        P310 p310 = new P310();

        int n = 4;
        int[][] edges = new int[][]{{1,0},{1,2},{1,3}};
        List<Integer> result = p310.findMinHeightTrees(n,edges);
        Assert.assertEquals(1,result.size());
        Assert.assertEquals(new Integer(1), result.get(0));

        n = 6;
        edges = new int[][]{
                {3,0},{3,1},{3,2},{3,4},{5,4}
        };
        result = p310.findMinHeightTrees(n,edges);
        Assert.assertEquals(2,result.size());

    }
}
