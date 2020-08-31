package org.alking.p800;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class P840 {

    private Map<Integer, Map<Integer, Integer>> calcRowMap(int[][] grid, int iMax, int jMax) {
        Map<Integer, Map<Integer, Integer>> rowSumCache = new HashMap<>();
        Map<Integer, Map<Integer, Integer>> rowGapMap = new HashMap<>();
        for (int i = 0; i < iMax; i++) {
            int sum = 0;
            rowSumCache.put(i, new HashMap<>());
            rowGapMap.put(i, new HashMap<>());
            for (int j = 0; j < jMax; j++) {
                sum += grid[i][j];
                rowSumCache.get(i).put(j, sum);
                if (j >= 2) {
                    rowGapMap.get(i).put(j - 2, sum - rowSumCache.get(i).getOrDefault(j - 3, 0));
                }
            }
        }
        return rowGapMap;
    }

    private Map<Integer, Map<Integer, Integer>> calcColMap(int[][] grid, int iMax, int jMax) {
        Map<Integer, Map<Integer, Integer>> colSumCache = new HashMap<>();
        Map<Integer, Map<Integer, Integer>> colGapMap = new HashMap<>();
        for (int j = 0; j < jMax; j++) {
            int sum = 0;
            colSumCache.put(j, new HashMap<>());
            colGapMap.put(j, new HashMap<>());
            for (int i = 0; i < iMax; i++) {
                sum += grid[i][j];
                colSumCache.get(j).put(i, sum);
                if (i >= 2) {
                    colGapMap.get(j).put(i - 2, sum - colSumCache.get(j).getOrDefault(i - 3, 0));
                }
            }
        }
        return colGapMap;
    }

    public int numMagicSquaresInside(int[][] grid) {
        int iMax = grid.length;
        int jMax = grid[0].length;
        Map<Integer, Map<Integer, Integer>> rowGapMap = calcRowMap(grid, iMax, jMax);
        Map<Integer, Map<Integer, Integer>> colGapMap = calcColMap(grid, iMax, jMax);
        int target = 15;
        int acc = 0;
        // i-1, i-2, i-3
        for (int i = 0; i < iMax - 2; i++) {

            for (int j = 0; j < jMax - 2; j++) {
                boolean[] visit = new boolean[10];
                boolean match = true;
                // check row sum
                for (int m = i; m < i + 3; m++) {

                    for( int x = 0; x < 3; x ++){
                        if(grid[m][j+x] > 9){
                            match = false;
                            break;
                        }
                        if(visit[grid[m][j+x]]){
                            match = false;
                            break;
                        }else {
                            visit[grid[m][j+x]] = true;
                        }
                    }

                    if (rowGapMap.get(m).get(j) != target) {
                        match = false;
                        break;

                    }
                }
                if (!match) {
                    continue;
                }
                // check col sum
                for (int n = j; n < j + 3; n++) {
                    if (colGapMap.get(n).get(i) != target) {
                        match = false;
                        break;
                    }
                }
                if (!match) {
                    continue;
                }

                int sum = 0;
                int sum2 = 0;
                for (int p = 0; p < 3; p++) {
                    sum += grid[i + p][j + p];
                    sum2 += grid[i + p][j + 2 - p];
                }

                if ((sum != target) || (sum2 != target)) {
                    continue;
                }
                acc += 1;
            }
        }
        return acc;

    }
}
