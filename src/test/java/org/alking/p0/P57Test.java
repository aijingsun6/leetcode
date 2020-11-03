package org.alking.p0;

import org.junit.Assert;
import org.junit.Test;

public class P57Test {

    @Test
    public void test(){
        int[][] intervals = new int[][]{{1,3},{6,9}};
        int[] newInterval= new int[]{2,5};
        int[][] res = new P57().insert(intervals,newInterval);
        Assert.assertArrayEquals(new int[][]{{1,5},{6,9}},res);
    }
}
