package org.alking.other;

import org.junit.Assert;
import org.junit.Test;

public class MissingNumberTest {

    @Test
    public void missingNumberTest(){
        MissingNumber mn = new MissingNumber();
        int[] arr = new int[]{3,0,1};
        Assert.assertEquals(2,mn.missingNumber(arr));
    }
}
