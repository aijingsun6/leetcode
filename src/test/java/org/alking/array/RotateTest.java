package org.alking.array;

import org.junit.Assert;
import org.junit.Test;

public class RotateTest {

    @Test
    public void rotateTest() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        new Rotate().rotate(arr, k);
        // [5,6,7,1,2,3,4]
        Assert.assertEquals(5, arr[0]);
    }
}
