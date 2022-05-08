package org.alking.p800;

import org.alking.common.TreeNode;

public class P865 {

    public TreeNode subtreeWithAllDeepest(TreeNode root) {

        if (root == null) {
            return null;
        }
        maxDepth = 0;
        maxCnt = 0;
        result = null;
        depth(root, 1);
        dfs(root, 1);
        return result;
    }

    private int maxDepth;
    private int maxCnt;
    private TreeNode result;

    private int dfs(TreeNode root, int depth) {
        int cnt = 0;
        if (depth == maxDepth) {
            cnt = 1;
        } else {
            if (root.left != null) {
                cnt += dfs(root.left, depth + 1);
            }
            if (root.right != null) {
                cnt += dfs(root.right, depth + 1);
            }
        }
        if (cnt == maxCnt && result == null) {
            result = root;
        }
        return cnt;
    }

    private void depth(TreeNode root, int acc) {

        if (acc > maxDepth) {
            maxDepth = acc;
            maxCnt = 1;
        } else if (acc == maxDepth) {
            maxCnt += 1;
        }
        if (root.left != null) {
            depth(root.left, acc + 1);
        }

        if (root.right != null) {
            depth(root.right, acc + 1);
        }
    }


}
