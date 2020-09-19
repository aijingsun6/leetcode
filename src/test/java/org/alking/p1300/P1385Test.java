package org.alking.p1300;

import org.junit.Assert;
import org.junit.Test;

public class P1385Test {

    @Test
    public void test(){
        P1385 p1385 = new P1385();
        int[] arr1 = new int[]{1,4,2,3};
        int[] arr2 = new int[]{-4,-3,6,10,20,30};
        int num = p1385.findTheDistanceValue(arr1,arr2,3);
        Assert.assertEquals(2,num);
    }
}
