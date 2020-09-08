package org.alking.p0;

import org.junit.Assert;
import org.junit.Test;

public class P56Test {

    @Test
    public void test(){
        P56 p56 = new P56();
        int[][] arr = {
                {1,3},{2,6},{8,10},{15,18}
        };
        int[][] res = p56.merge(arr);
        int[][] expect = {{1,6},{8,10},{15,18}};
        Assert.assertArrayEquals(expect,res);
    }

    @Test
    public void test2(){
        P56 p56 = new P56();
        int[][] arr = {
                {2,3},{4,5},{6,7},{8,9},{1,10}
        };
        int[][] res = p56.merge(arr);
        int[][] expect = {{1,10}};
        Assert.assertArrayEquals(expect,res);
    }
}
