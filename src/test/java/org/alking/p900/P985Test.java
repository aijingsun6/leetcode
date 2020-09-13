package org.alking.p900;

import org.junit.Assert;
import org.junit.Test;

public class P985Test {

    @Test
    public void test(){
        P985 p985 = new P985();
        int[] nums = new int[]{1,2,3,4};
        int[][] query = new int[][]{
                {1,0},{-3,1},{-4,0},{2,3}
        };
        int[] result = p985.sumEvenAfterQueries(nums,query);
        Assert.assertArrayEquals(new int[]{8,6,2,4},result);

    }
}
