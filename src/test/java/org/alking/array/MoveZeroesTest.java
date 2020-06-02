package org.alking.array;

import org.junit.Assert;
import org.junit.Test;

public class MoveZeroesTest {

    @Test
    public void test(){
        MoveZeroes mz = new MoveZeroes();
        // [0,1,0,3,12]
        int[] nums = {0,1,0,3,12};
        mz.moveZeroes(nums);
        Assert.assertArrayEquals(nums,new int[]{1,3,12,0,0});

    }

    @Test
    public void test2(){
        MoveZeroes mz = new MoveZeroes();
        int[] nums = {0,0,1};
        mz.moveZeroes(nums);
        Assert.assertArrayEquals(nums,new int[]{1,0,0});

    }

}
