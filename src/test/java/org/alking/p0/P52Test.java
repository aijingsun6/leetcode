package org.alking.p0;

import org.junit.Assert;
import org.junit.Test;

public class P52Test {

    @Test
    public void test(){
        P52 p52 = new P52();
        Assert.assertEquals(2, p52.totalNQueens(4));
        Assert.assertEquals(10, p52.totalNQueens(5));
    }
}
