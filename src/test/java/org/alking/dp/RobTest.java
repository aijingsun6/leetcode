package org.alking.dp;

import org.junit.Assert;
import org.junit.Test;

public class RobTest {

    private Rob rob = new Rob();

    @Test
    public void robTest(){

        int[] arr = {1,2,3,1};
        Assert.assertEquals(4,rob.rob(arr));

        arr = new int[]{2,7,9,3,1};
        Assert.assertEquals(12,rob.rob(arr));

    }
}
