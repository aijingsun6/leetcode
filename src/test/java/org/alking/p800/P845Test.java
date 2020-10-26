package org.alking.p800;

import org.junit.Assert;
import org.junit.Test;

public class P845Test {

    @Test
    public void test(){
        P845 p845 = new P845();
        Assert.assertEquals(5,p845.longestMountain(new int[]{2,1,4,7,3,2,5}));
        Assert.assertEquals(0,p845.longestMountain(new int[]{2,2,2}));
        Assert.assertEquals(3,p845.longestMountain(new int[]{0,1,0,1}));
    }
}
