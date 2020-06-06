package org.alking.array;

import org.junit.Assert;
import org.junit.Test;

public class PlusOneTest {

    @Test
    public void test(){
        PlusOne plusOne = new PlusOne();
        Assert.assertArrayEquals(new int[]{1},plusOne.plusOne(null));
        Assert.assertArrayEquals(new int[]{4,3,2,2},plusOne.plusOne(new int[]{4,3,2,1}));
        Assert.assertArrayEquals(new int[]{1,0,0,0},plusOne.plusOne(new int[]{9,9,9}));
    }
}
