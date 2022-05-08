package org.alking.p1300;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class P1361 {

    public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {

        int[] rudu = new int[n];
        int[] chudu = new int[n];

        ArrayList<Integer>[] adj = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();
        }

        // 判断入度
        for (int i = 0; i < n; i++) {
            int[] arr = new int[]{leftChild[i], rightChild[i]};
            for (int x : arr) {
                if (x > -1) {
                    adj[i].add(x);
                    chudu[i]++;
                    if (++rudu[x] > 1) {
                        // 入度 >= 2了，肯定不是什么树
                        return false;
                    }
                }
            }
        }


        // 找入度= 0，是根,如果出现多个根，那么就有问题了

        ArrayList<Integer> root = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (rudu[i] == 0) {
                root.add(i);
            }
        }

        if (root.size() != 1) {
            return false;
        }

        //广度优先遍历
        boolean[] visit = new boolean[n];
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        int count = 0;
        queue.addLast(root.get(0));
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int p = queue.removeFirst();
                if (visit[p]) {
                    return false;
                }
                visit[p] = true;
                count++;
                for (int j : adj[p]) {
                    queue.addLast(j);
                }
            }
        }
        return count == n;

    }
}
