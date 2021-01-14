package org.alking.p100;

import org.alking.common.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode-cn.com/problems/balanced-binary-tree/">110. 平衡二叉树</a>
 */
public class P110 {

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return false;
        }
        Map<TreeNode, Integer> cache = new HashMap<>();
        return isBalanced(root, cache);
    }

    private boolean isBalanced(TreeNode root, Map<TreeNode, Integer> cache) {
        if(root == null){
            return true;
        }
        int depthLeft = depth(root.left, cache);
        int depthRight = depth(root.right, cache);
        if (Math.abs(depthLeft - depthRight) > 1) {
            return false;
        }
        return isBalanced(root.left, cache) && isBalanced(root.right, cache);
    }

    private int depth(TreeNode n, Map<TreeNode, Integer> cache) {
        if (n == null) {
            return 0;
        }
//        if (cache.containsKey(n)) {
//            return cache.get(n);
//        }
        int depthLeft = depth(n.left,cache);
        int depthRight = depth(n.right, cache);
        int depth = 1 + Math.max(depthLeft, depthRight);
//        cache.put(n, depth);
        return depth;
    }
}
