package org.alking.p1700;

import org.junit.Assert;
import org.junit.Test;

public class P1738Test {

    @Test
    public void test(){
        P1738 p1738 = new P1738();
        int[][] matrix = new int[][]{
                {5,2},
                {1,6}
        };
        int k = 1;
        int result = p1738.kthLargestValue(matrix,k);
        Assert.assertEquals(7,result);

        k = 2;
        result = p1738.kthLargestValue(matrix,k);
        Assert.assertEquals(5,result);

        k = 3;
        result = p1738.kthLargestValue(matrix,k);
        Assert.assertEquals(4,result);

        k = 4;
        result = p1738.kthLargestValue(matrix,k);
        Assert.assertEquals(0,result);
    }
}
