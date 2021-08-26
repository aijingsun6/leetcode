package org.alking.p800;

import org.junit.Assert;
import org.junit.Test;

public class P853Test {

    @Test
    public void test(){
        P853 p853 = new P853();

        int target = 12;
        int[] position = new int[]{10,8,0,5,3};
        int[] speed = new int[]{2,4,1,1,3};
        int result = p853.carFleet(target,position,speed);
        Assert.assertEquals(3,result);

        target = 10;
        position = new int[]{0,4,2};
        speed = new int[]{2,1,3};
        result = p853.carFleet(target,position,speed);
        Assert.assertEquals(1,result);

    }
}
