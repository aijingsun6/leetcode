package org.alking.p0;

import java.util.ArrayList;

public class P52 {

    int res = 0;

    public int totalNQueens(int n) {
        res = 0;
        colVisit = new boolean[n];
        dfs(n, 0, new ArrayList<>());
        return res;
    }

    private boolean[] colVisit;

    private void dfs(int n, int row, ArrayList<int[]> queue) {
        if (n == row) {
            res += 1;
            return;
        }
        for (int col = 0; col < n; col++) {
            if (colVisit[col]) {
                continue;
            }
            boolean check = false;
            for(int[] v: queue){
                if(Math.abs(v[0] - row) == Math.abs(v[1]- col)){
                    check = true;
                    break;
                }
            }
            if(check){
                continue;
            }
            colVisit[col] = true;
            queue.add(new int[]{row,col});
            dfs(n, row + 1, queue);
            colVisit[col] = false;
            queue.remove(queue.size() - 1);
        }
    }
}
