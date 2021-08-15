package org.alking.p100;

import org.alking.common.TreeNode;

public class P124 {

    private int result;

    public int maxPathSum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        this.result = Integer.MIN_VALUE;
        pathSumMax(root);
        return result;

    }

    private int pathSumMax(TreeNode root) {
        int left = 0;
        int right = 0;
        if (root.left != null) {
            left = pathSumMax(root.left);
        }
        if (root.right != null) {
            right = pathSumMax(root.right);
        }
        if(root.left != null && root.right != null){
            result = Math.max(result, left + root.val + right);
        }
        int max = root.val;
        max = Math.max(max, root.val + left);
        max = Math.max(max, root.val + right);
        result = Math.max(result, max);
        return max;
    }


}
