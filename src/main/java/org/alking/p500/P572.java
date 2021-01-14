package org.alking.p500;

import org.alking.common.TreeNode;

public class P572 {

    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (s.val == t.val && isSame(s, t)) {
            return true;
        }
        boolean left = false;
        if (s.left != null) {
            left = isSubtree(s.left, t);
        }
        boolean right = false;
        if (s.right != null) {
            right = isSubtree(s.right, t);
        }
        return left || right;
    }


    private boolean isSame(TreeNode n1, TreeNode n2) {

        if (n1 == null && n2 == null) {
            return true;
        }
        if (n1 != null && n2 != null) {

            if (n1.val != n2.val) {
                return false;
            }
            return isSame(n1.left, n2.left) && isSame(n1.right, n2.right);
        }
        return false;
    }
}
