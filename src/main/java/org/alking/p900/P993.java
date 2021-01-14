package org.alking.p900;

import org.alking.common.TreeNode;

public class P993 {

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
