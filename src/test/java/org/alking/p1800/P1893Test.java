package org.alking.p1800;

import org.junit.Assert;
import org.junit.Test;

public class P1893Test {

    @Test
    public void test(){
        P1893 p1893 = new P1893();
        int[][] ranges = new int[][]{
                {1,2},
                {3,4},
                {5,6}
        };
        int left = 2;
        int right = 6;
        boolean result = p1893.isCovered(ranges,left,right);
        Assert.assertTrue(result);

//        [[13,43],[19,20],[32,38],[26,33],[3,38],[16,31],[26,48],[27,43],[12,24]]
//        36
//        45

        ranges = new int[][]{
                {13,43},
                {19,20},
                {32,38},
                {26,33},
                {3,38},
                {16,31},
                {26,48},
                {27,43},
                {12,24}
        };
        left  = 36;
        right = 45;
        result = p1893.isCovered(ranges,left,right);
        Assert.assertTrue(result);

        ranges = new int[][]{
                {1,1},
                {3,3}
        };
        left  = 3;
        right = 3;
        result = p1893.isCovered(ranges,left,right);
        Assert.assertTrue(result);

        //[[37,49],[5,17],[8,32]]
        //29
        //49
        ranges = new int[][]{
                {37,49},
                {5,17},
                {8,32}
        };
        left  = 29;
        right = 49;
        result = p1893.isCovered(ranges,left,right);
        Assert.assertFalse(result);
    }
}
