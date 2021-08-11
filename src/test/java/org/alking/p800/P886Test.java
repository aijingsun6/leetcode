package org.alking.p800;

import org.junit.Assert;
import org.junit.Test;

public class P886Test {

    @Test
    public void test(){
        P886 p886 = new P886();
        int N = 4;
        int[][] dislikes = new int[][]{{1,2},{1,3},{2,4}};
        boolean result = p886.possibleBipartition(N,dislikes);
        Assert.assertTrue(result);


        dislikes = new int[][]{{1,2},{1,3},{2,3}};
        N = 3;
        result = p886.possibleBipartition(N,dislikes);
        Assert.assertFalse(result);
    }
}
