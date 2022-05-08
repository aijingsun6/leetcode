package org.alking.p700;

import org.junit.Assert;
import org.junit.Test;

public class P743Test {

   private P743 p743 = new P743();


   private int networkDelayTime(int[][] times, int n, int k){
       return p743.networkDelayTimeDijkstra(times,n,k);
   }


    @Test
    public void test() {

        int[][] times = new int[][]{
                {2,1,1},
                {2,3,1},
                {3,4,1}
        };
        int n = 4;
        int k = 2;
        int result = networkDelayTime(times,n,k);
        Assert.assertEquals(2,result);

        times = new int[][]{
                {1,2,1}
        };
        n = 2;
        k = 1;

        result = p743.networkDelayTime(times,n,k);
        Assert.assertEquals(1,result);
        n = 2;
        k = 2;
        result = p743.networkDelayTime(times,n,k);
        Assert.assertEquals(-1,result);

        times = new int[][]{
                {3,5,78},
                {2,1,1},
                {1,3,0},
                {4,3,59},
                {5,3,85},
                {5,2,22},
                {2,4,23},
                {1,4,43},
                {4,5,75},
                {5,1,15},
                {1,5,91},
                {4,1,16},
                {3,2,98},
                {3,4,22},
                {5,4,31},
                {1,2,0},
                {2,5,4},
                {4,2,51},
                {3,1,36},
                {2,3,59}
        };
        n = 5;
        k = 5;
        result = p743.networkDelayTime2(times,n,k);
        Assert.assertEquals(31,result);
    }
}
