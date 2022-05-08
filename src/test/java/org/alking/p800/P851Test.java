package org.alking.p800;

import org.junit.Assert;
import org.junit.Test;

public class P851Test {

    @Test
    public void test(){
        P851 p851 = new P851();
        int[][] richer = {{1,0},{2,1},{3,1},{3,7},{4,3},{5,3},{6,3}};
        int[] quiet = {3,2,5,4,6,1,7,0};
        int[] result = p851.loudAndRich(richer,quiet);
        Assert.assertArrayEquals(new int[]{5,5,2,5,4,5,6,7},result);

    }
}
