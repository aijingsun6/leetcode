package org.alking.graph;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class BellmanTest {

    @Test
    public void test() {
        int[][] edge = new int[][]{
                {1, 6, 3},
                {1, 2, 10},
                {2, 3, 7},
                {2, 4, 5},
                {4, 1, 3},
                {4, 3, 4},
                {4, 5, 7},
                {6, 2, 2},
                {6, 4, 6},
                {6, 5, 1}
        };
        int[] dist = new int[7];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[1] = 0;
        for (int i = 2; i <= 6; i++) {
            for (int[] e : edge) {
                int from = e[0];
                int to = e[1];
                int d = e[2];
                dist[to] = Math.min(dist[to], dist[from] + d);
            }
        }
        int[] result = new int[]{Integer.MAX_VALUE, 0, 5, 12, 9, 4, 3};
        Assert.assertArrayEquals(result, dist);
    }
}
