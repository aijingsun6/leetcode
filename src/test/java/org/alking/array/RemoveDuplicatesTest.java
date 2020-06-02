package org.alking.array;

import org.junit.Assert;
import org.junit.Test;

public class RemoveDuplicatesTest {

    private RemoveDuplicates removeDuplicates = new RemoveDuplicates();

    @Test
    public void test(){
        int[] arr = {1,1,2};
        int size = removeDuplicates.removeDuplicates(arr);
        Assert.assertEquals(2,size);
        Assert.assertEquals(1,arr[0]);
        Assert.assertEquals(2,arr[1]);
    }

    @Test
    public void test2(){
        int[] arr = {1,1,2,2,3,3};
        int size = removeDuplicates.removeDuplicates(arr);
        Assert.assertEquals(3,size);
        Assert.assertEquals(1,arr[0]);
        Assert.assertEquals(2,arr[1]);
        Assert.assertEquals(3,arr[2]);
    }

    @Test
    public void test3(){
//        [0,0,1,1,1,2,2,3,3,4]
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        int size = removeDuplicates.removeDuplicates(arr);
        Assert.assertEquals(5,size);
        Assert.assertEquals(0,arr[0]);
        Assert.assertEquals(1,arr[1]);
        Assert.assertEquals(2,arr[2]);
        Assert.assertEquals(3,arr[3]);
        Assert.assertEquals(4,arr[4]);
    }
}
