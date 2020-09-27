package org.alking.p200;

import java.util.ArrayList;

public class P236 {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        ArrayList<TreeNode> pp = findPath(root, p, new ArrayList<>());
        ArrayList<TreeNode> pq = findPath(root, q, new ArrayList<>());

        int min = Math.min(pp.size(), pq.size());
        for (int i = 1; i < min; i++) {
            if (pp.get(i).val != pq.get(i).val) {
                return pp.get(i - 1);
            }
        }
        return pp.get(min - 1);
    }

    private ArrayList<TreeNode> findPath(TreeNode root, TreeNode n, ArrayList<TreeNode> path) {

        path.add(root);
        if (root.val == n.val) {
            return path;
        }

        if (root.left != null) {
            ArrayList<TreeNode> p = findPath(root.left, n, path);
            if (p != null) {
                return p;
            }
        }

        if (root.right != null) {
            ArrayList<TreeNode> p = findPath(root.right, n, path);
            if (p != null) {
                return p;
            }
        }

        path.remove(path.size() - 1);
        return null;
    }
}
