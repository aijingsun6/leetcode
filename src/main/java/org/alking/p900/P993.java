package org.alking.p900;

import java.util.List;

public class P993 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean isCousins(TreeNode root, int x, int y) {

        if (root.val == x || root.val == y) {
            return false;
        }
        int[] xx = findDepthParent(root, null, 0, x);
        int[] yy = findDepthParent(root, null, 0, y);
        return xx[0] == yy[0] && xx[1] != yy[1];
    }


    private int[] findDepthParent(TreeNode root, TreeNode parent, int depth, int x) {

        if (root.val == x) {
            return new int[]{depth, parent.val};
        }
        if (root.left != null) {
            int[] ret = findDepthParent(root.left, root, depth + 1, x);
            if (ret != null) {
                return ret;
            }
        }
        if (root.right != null) {
            int[] ret = findDepthParent(root.right, root, depth + 1, x);
            if (ret != null) {
                return ret;
            }
        }

        return null;

    }


}
