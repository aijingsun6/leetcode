package org.alking.p1300;

import java.util.Arrays;
import java.util.Comparator;

public class P1337 {

    public static class LineInfo {

        public int lineNum;

        public int armNum;

        public LineInfo(int lineNum, int armNum) {
            this.lineNum = lineNum;
            this.armNum = armNum;
        }
    }

    public int[] kWeakestRows(int[][] mat, int k) {

        LineInfo[] infos = new LineInfo[mat.length];
        for(int i = 0 ;i < mat.length;i++){
            int sum = 0;
            for(int j = 0; j < mat[i].length;j++){
                sum += mat[i][j];
            }
            infos[i] = new LineInfo(i,sum);
        }
        Arrays.sort(infos, new Comparator<LineInfo>() {
            @Override
            public int compare(LineInfo o1, LineInfo o2) {

                if(o1.armNum < o2.armNum){
                    return -1;
                }else if(o1.armNum > o2.armNum){
                    return 1;
                }
                return o1.lineNum - o2.lineNum;
            }
        });

        int[] result = new int[k];
        for(int i = 0;i < k; i++){
            result[i] = infos[i].lineNum;
        }
        return result;
    }
}
