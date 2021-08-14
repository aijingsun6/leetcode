package org.alking.p1300;

import org.junit.Assert;
import org.junit.Test;

public class P1334Test {

    @Test
    public void test(){
        P1334 p1334 = new P1334();
        int n = 4;
        int[][] edges = new int[][]{{0,1,3},{1,2,1},{1,3,4},{2,3,1}};
        int distanceThreshold = 4;
        int result = p1334.findTheCity(n,edges,distanceThreshold);
        Assert.assertEquals(3,result);
        n = 5;
        edges = new int[][]{{0,1,2},{0,4,8},{1,2,3},{1,4,2},{2,3,1},{3,4,1}};
        distanceThreshold = 2;
        result = p1334.findTheCity(n,edges,distanceThreshold);
        Assert.assertEquals(0,result);
    }
}
