package org.alking.p1500;

import java.util.ArrayList;
import java.util.List;

public class P1582 {

    public int numSpecial(int[][] mat) {
        if (mat == null || mat.length == 0) {
            return 0;
        }
        int iMax = mat.length;
        int jMax = mat[0].length;
        List<Integer>[] rowArr = new List[iMax];
        List<Integer>[] colArr = new List[jMax];

        for (int i = 0; i < iMax; i++) {
            rowArr[i] = new ArrayList<>();
            for (int j = 0; j < jMax; j++) {
                if (colArr[j] == null) {
                    colArr[j] = new ArrayList<>();
                }
                if (mat[i][j] == 1) {
                    rowArr[i].add(j);
                    colArr[j].add(i);
                }
            }
        }
        int sum = 0;
        for (int i = 0; i < iMax; i++) {
            if (rowArr[i].size() == 1 &&  colArr[rowArr[i].get(0)].size() == 1) {
                sum += 1;
            }
        }
        return sum;
    }
}
