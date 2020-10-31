package org.alking.p500;

public class P572 {

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
