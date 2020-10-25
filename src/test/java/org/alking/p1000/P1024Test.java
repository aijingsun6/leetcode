package org.alking.p1000;

import org.junit.Assert;
import org.junit.Test;

public class P1024Test {

    @Test
    public void test(){
        P1024 p1024 = new P1024();
        int[][] clips = new int[][]{{0,2},{4,6},{8,10},{1,9},{1,5},{5,9}};
        int target = 10;
        int res = p1024.videoStitching(clips,target);
        Assert.assertEquals(3, res);

    }
}
