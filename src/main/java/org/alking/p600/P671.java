package org.alking.p600;

import java.util.ArrayDeque;

public class P671 {

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

    public int findSecondMinimumValue(TreeNode root) {
        if (root == null) {
            return -1;
        }
        if (root.left == null && root.right == null) {
            return -1;
        }
        int first = root.val;
        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        int min = 0;
        boolean hasMin = false;
        // 广度优先
        while (!queue.isEmpty()) {
            int size = queue.size();
            boolean next = false;
            for (int i = 0; i < size; i++) {
                TreeNode n = queue.poll();
                if (n.val > first) {
                    if (hasMin) {
                        min = Math.min(min, n.val);
                    } else {
                        min = n.val;
                        hasMin = true;
                    }
                } else {
                    next = true;
                }
                if (n.left != null) {
                    queue.add(n.left);
                }
                if (n.right != null) {
                    queue.add(n.right);
                }
                if (!next) {
                    break;
                }
            }
        }
        if (hasMin) {
            return min;
        }
        return -1;
    }
}
