package org.alking.p600;

import org.alking.common.TreeNode;

public class P662 {

    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int depth = depth(root);
        if (depth == 1) {
            return 1;
        }
        leftIdx = new long[depth + 1];
        rightIdx = new long[depth + 1];
        result = 0;
        dfs(root, 1, 1);
        return result;
    }

    private int result = 0;

    private long[] leftIdx;
    private long[] rightIdx;

    private void dfs(TreeNode root, int depth, long idx) {

        //update leftIdx
        if (leftIdx[depth] == 0) {
            leftIdx[depth] = idx;
        } else {
            leftIdx[depth] = Math.min(leftIdx[depth], idx);
        }

        if (rightIdx[depth] == 0) {
            rightIdx[depth] = idx;
        } else {
            rightIdx[depth] = Math.max(rightIdx[depth], idx);
        }
        result = (int)Math.max(result, rightIdx[depth] - leftIdx[depth] + 1);
        if (root.left != null) {
            dfs(root.left, depth + 1, idx * 2);
        }
        if (root.right != null) {
            dfs(root.right, depth + 1, idx * 2 + 1);
        }
    }

    private int depth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int ld = depth(root.left);
        int rd = depth(root.right);
        return 1 + Math.max(ld, rd);
    }


}
