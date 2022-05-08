package org.alking.p1300;

import org.junit.Assert;
import org.junit.Test;

public class P1345Test {

    @Test
    public void test(){
        P1345 p1345 = new P1345();
        int[] arr = new int[]{100,-23,-23,404,100,23,23,23,3,404};
        int result = p1345.minJumps(arr);
        Assert.assertEquals(3,result);

        arr = new int[]{7};
        result = p1345.minJumps(arr);
        Assert.assertEquals(0,result);

        arr = new int[]{7,6,9,6,9,6,9,7};
        result = p1345.minJumps(arr);
        Assert.assertEquals(1,result);

    }

}
