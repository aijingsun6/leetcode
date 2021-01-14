package org.alking.p200;

import java.util.ArrayList;
import java.util.List;

public class P257 {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<String> acc = new ArrayList<>();
        dfs(root, acc, null);
        return acc;
    }

    private void dfs(TreeNode root, List<String> result, String acc) {
        if (root == null) {
            return;
        }

        if (acc == null) {
            acc = String.valueOf(root.val);
        } else {
            acc = acc + "->" + root.val;
        }

        boolean isLeaf = root.left == null && root.right == null;

        if (isLeaf) {
            result.add(acc);
            return;
        }
        if (root.left != null) {
            dfs(root.left, result, acc);
        }

        if (root.right != null) {
            dfs(root.right, result, acc);
        }
    }
}
