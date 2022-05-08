package org.alking.p200;

import org.junit.Assert;
import org.junit.Test;

public class P207Test {

    @Test
    public void test(){
        P207 p207 = new P207();
        int[][] prerequisites = new int[][]{{1,0}};
        int numCourses = 2;
        boolean result = p207.canFinish(numCourses,prerequisites);
        Assert.assertTrue(result);


        prerequisites = new int[][]{{1,0},{0,1}};
        result = p207.canFinish(numCourses,prerequisites);
        Assert.assertFalse(result);


        prerequisites = new int[][]{{1,4},{2,4},{3,1},{3,2}};
        numCourses = 5;
        result = p207.canFinish(numCourses,prerequisites);
        Assert.assertTrue(result);

    }
}
