package org.alking.p800;

import org.junit.Assert;
import org.junit.Test;

public class P834Test {

    @Test
    public void test(){
        P834 p834 = new P834();
        int[][] edges = new int[][]{
                {0,1},{0,2},{2,3},{2,4},{2,5}
        };
        int[] result = p834.sumOfDistancesInTree(6, edges);
        Assert.assertArrayEquals(new int[]{8,12,6,10,10,10},result);

    }
}
