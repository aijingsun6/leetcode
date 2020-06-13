package org.alking.array;

import org.junit.Assert;
import org.junit.Test;

public class MergeArrayTest {

    private MergeArray ma = new MergeArray();

    @Test
    public void mergeTest(){

        int[] num1 = {1,2,3,0,0,0};
        int[] num2 = {2,5,6};
        ma.merge(num1,3,num2,3);
        int[] result = {1,2,2,3,5,6};
        Assert.assertArrayEquals(result,num1);

    }
}
