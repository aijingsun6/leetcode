package org.alking.p700;

import org.alking.common.TreeNode;

import java.util.ArrayDeque;

public class P783 {

    private int min = Integer.MAX_VALUE;
    ArrayDeque<Integer> queue = new ArrayDeque<>();
    public int minDiffInBST(TreeNode root) {
        if (root == null) {
            return -1;
        }
        min = Integer.MAX_VALUE;
        queue.clear();
        dfs(root);
        return min;
    }

    private void appendQueue(Integer v) {
        if (queue.isEmpty()) {
            queue.addLast(v);
            return;
        }
        int last = queue.getLast();
        min = Math.min(min, v - last);
        queue.addLast(v);
        queue.removeFirst();
    }

    private void dfs(TreeNode root) {

        if (root.left != null) {
            dfs(root.left);
        }
        appendQueue(root.val);
        if (root.right != null) {
            dfs(root.right);
        }
    }


}
