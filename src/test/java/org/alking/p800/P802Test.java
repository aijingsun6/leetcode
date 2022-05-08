package org.alking.p800;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class P802Test {

    @Test
    public void test(){
        P802 p802 = new P802();
        int[][] graph = new int[][]{
                {1,2},{2,3},{5},{0},{5},{},{}
        };
        int[] result = toArray(p802.eventualSafeNodes2(graph));
        int[] expect = new int[]{2,4,5,6};
        Assert.assertArrayEquals(expect,result);

        graph = new int[][]{
                {1,2,3,4},{1,2},{3,4},{0,4},{}
        };
        result = toArray(p802.eventualSafeNodes2(graph));
        expect = new int[]{4};
        Assert.assertArrayEquals(expect,result);

    }

    private int[] toArray(List<Integer> list){
        int[] result = new int[list.size()];
        for(int i = 0; i < list.size();i++){
            result[i] = list.get(i);
        }
        return result;
    }
}
