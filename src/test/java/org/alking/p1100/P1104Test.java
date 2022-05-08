package org.alking.p1100;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class P1104Test {

    @Test
    public void test(){
        P1104 p1104 = new P1104();
        List<Integer> result = p1104.pathInZigZagTree(14);
        int[] arr = list2Arr(result);
        Assert.assertArrayEquals(new int[]{1,3,4,14},arr);

        result = p1104.pathInZigZagTree(26);
        arr = list2Arr(result);
        Assert.assertArrayEquals(new int[]{1,2,6,10,26},arr);


        result = p1104.pathInZigZagTree(16);
        arr = list2Arr(result);
        Assert.assertArrayEquals(new int[]{1,3,4,15,16},arr);

    }

    private int[] list2Arr(List<Integer> list){
        int[] result = new int[list.size()];
        for(int i = 0; i < result.length;i++){
            result[i] = list.get(i);
        }
        return result;
    }
}
