package org.alking.p500;

import org.junit.Assert;
import org.junit.Test;

public class P517Test {

    @Test
    public void test(){
        P517 p517 = new P517();
        int[] machines= new int[]{1,0,5};
        int result = p517.findMinMoves(machines);
        Assert.assertEquals(3,result);

        machines= new int[]{0,3,0};
        result = p517.findMinMoves(machines);
        Assert.assertEquals(2,result);

        machines= new int[]{4,0,0,4};
        result = p517.findMinMoves(machines);
        Assert.assertEquals(2,result);

        machines= new int[]{7,6,5,4,3,2,1};
        result = p517.findMinMoves(machines);
        Assert.assertEquals(6,result);

        machines= new int[]{0,0,10,0,0,0,10,0,0,0};
        result = p517.findMinMoves(machines);
        Assert.assertEquals(8,result);

        machines = new int[]{0,0,4,0,5,0,5,0,4};
        result = p517.findMinMoves(machines);
        Assert.assertEquals(4,result);


        machines = new int[]{4,9,8,4,0};
        result = p517.findMinMoves(machines);
        Assert.assertEquals(6,result);

    }
}
