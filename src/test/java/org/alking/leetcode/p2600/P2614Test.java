package org.alking.leetcode.p2600;

import org.junit.Assert;
import org.junit.Test;

public class P2614Test {

    @Test
    public void test(){
        P2614 p2614 = new P2614();
        int[][] nums = new int[][]{
                {1,2,3},{4,5,6},{7,8,9}
        };
        int r = p2614.diagonalPrime(nums);
        int e = 7;
        Assert.assertEquals(e, r);

        nums =  new int[][]{{1,2,3},{5,17,7},{9,11,10}};
        r = p2614.diagonalPrime(nums);
        e = 17;
        Assert.assertEquals(e, r);

    }
}
