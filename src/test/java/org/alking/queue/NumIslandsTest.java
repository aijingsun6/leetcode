package org.alking.queue;

import org.junit.Assert;
import org.junit.Test;

public class NumIslandsTest {

    @Test
    public void numIslandsTest(){
        NumIslands nil = new NumIslands();
        char[][] grid = {
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}
        };

        int result = nil.numIslands(grid);
        Assert.assertEquals(1,result);

        char[][] grid2 = {
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'}
        };
        result = nil.numIslands(grid2);
        Assert.assertEquals(3,result);


    }
}
