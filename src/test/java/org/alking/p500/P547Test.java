package org.alking.p500;

import org.junit.Assert;
import org.junit.Test;

public class P547Test {

    @Test
    public void test(){
        P547 p547 = new P547();
        int[][] connect = new int[][]{
                {1,1,0},
                {1,1,0},
                {0,0,1}
        };
        int cnt = p547.findCircleNum(connect);
        Assert.assertEquals(2,cnt);

        connect = new int[][]{
                {1,0,0,1},
                {0,1,1,0},
                {0,1,1,1},
                {1,0,1,1}
        };
        cnt = p547.findCircleNum(connect);
        Assert.assertEquals(1,cnt);
    }
}
