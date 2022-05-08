package org.alking.p400;

import org.junit.Assert;
import org.junit.Test;

public class P419Test {

    @Test
    public void test(){
        P419 p419 = new P419();
        char[][] board = new char[][]{
                {'X','.','.','X'},
                {'.','.','.','X'},
                {'.','.','.','X'},
                {'.','.','.','X'}
        };
        int result = p419.countBattleshipsV2(board);
        Assert.assertEquals(2,result);
    }
}
