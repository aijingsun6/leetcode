package org.alking.p700;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class P797Test {

    @Test
    public void test() {
        P797 p797 = new P797();
        int[][] graph = new int[][]{{1, 2}, {3}, {3}, {}};
        List<List<Integer>> result = p797.allPathsSourceTarget(graph);
        Assert.assertEquals(2, result.size());

        graph = new int[][]{{4, 3, 1}, {3, 2, 4}, {3}, {4}, {}};
        result = p797.allPathsSourceTarget(graph);
        Assert.assertEquals(5, result.size());
    }
}
