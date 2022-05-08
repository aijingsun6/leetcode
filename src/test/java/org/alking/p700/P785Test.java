package org.alking.p700;

import org.junit.Assert;
import org.junit.Test;

public class P785Test {

    @Test
    public void test(){

        P785 p785 = new P785();
        int[][] graph = {{1,2,3},{0,2},{0,1,3},{0,2}};
        boolean result = p785.isBipartite(graph);
        Assert.assertFalse(result);
        graph = new int[][]{{1,3},{0,2},{1,3},{0,2}};
        result = p785.isBipartite(graph);
        Assert.assertTrue(result);

        graph = new int[][]{{},{2,4,6},{1,4,8,9},{7,8},{1,2,8,9},{6,9},{1,5,7,8,9},{3,6,9},{2,3,4,6,9},{2,4,5,6,7,8}};
        result = p785.isBipartite(graph);
        Assert.assertFalse(result);

        graph = new int[][]{{}};
        result = p785.isBipartite(graph);
        Assert.assertTrue(result);

        graph = new int[][]{
                {1},
                {0,3},
                {3},
                {1,2}};
        result = p785.isBipartite(graph);
        Assert.assertTrue(result);

    }
}
