package org.alking.p1700;

import java.util.PriorityQueue;

/**
 * https://leetcode-cn.com/problems/find-kth-largest-xor-coordinate-value/
 */
public class P1738 {

    public int kthLargestValue(int[][] matrix, int k) {

        int row = matrix.length;
        int col = matrix[0].length;

        // 先算每一行的前缀
        int[][] rowPre = new int[row][];
        for (int i = 0; i < row; i++) {
            int[] r = new int[col];
            int sum = 0;
            for (int j = 0; j < col; j++) {
                sum ^= matrix[i][j];
                r[j] = sum;
            }
            rowPre[i] = r;
        }

        PriorityQueue<Integer> q = new PriorityQueue<>();
        for (int j = 0; j < col; j++) {
            int sum = 0;
            for (int i = 0; i < row; i++) {
                sum ^= rowPre[i][j];
                if (q.size() < k) {
                    q.offer(sum);
                } else {
                    //q.size = k
                    int p = q.peek();
                    if (sum > p) {
                        q.poll();
                        q.offer(sum);
                    }
                }
            }
        }

        return q.peek();
    }
}
