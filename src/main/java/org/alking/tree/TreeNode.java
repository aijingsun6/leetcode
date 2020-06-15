package org.alking.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TreeNode {

    int val;

    TreeNode left;

    TreeNode right;

    TreeNode(int x) {
        val = x;
    }


    public int maxDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return 1 + Math.max(left, right);
    }

    private int maxValue(TreeNode root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        int max = Math.max(root.val, maxValue(root.left));
        return Math.max(max, maxValue(root.right));
    }

    private int minValue(TreeNode root) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }
        int min = Math.min(root.val, minValue(root.left));
        return Math.min(min, minValue(root.right));
    }

    private boolean isValidBST(TreeNode root, int v, boolean leftOrRight) {
        if (root == null) {
            return true;
        }
        if (leftOrRight && root.val >= v) {
            return false;
        }
        if (!leftOrRight && root.val <= v) {
            return false;
        }
        return isValidBST(root.left, v, leftOrRight) && isValidBST(root.right, v, leftOrRight);
    }

    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            // for  root
            return true;
        }
        boolean leftCheck = true;
        if (root.left != null) {
            leftCheck = isValidBST(root.left, root.val, true);
        }
        boolean rightCheck = true;
        if (root.right != null) {
            rightCheck = isValidBST(root.right, root.val, false);
        }
        if (!leftCheck || !rightCheck) {
            return false;
        }

        return isValidBST(root.left) && isValidBST(root.right);
    }


    /**
     * 中序
     *
     * @param root
     * @param acc
     */
    private void order(TreeNode root, List<Integer> acc) {
        if (root.left != null) {
            order(root.left, acc);
        } else {
            acc.add(null);
        }
        acc.add(root.val);
        if (root.right != null) {
            order(root.right, acc);
        } else {
            acc.add(null);
        }
    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isSymmetric(root.left, root.right);
    }

    private boolean isSymmetric(TreeNode left, TreeNode right) {

        if (left != null && right != null) {
            if (left.val != right.val) {
                return false;
            }
            return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
        }

        if (left != null || right != null) {
            return false;
        }
        return true;
    }


    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> acc = new ArrayList<>();
        levelOrder(root, 0, acc);
        return acc;
    }

    private void levelOrder(TreeNode root, int level, List<List<Integer>> acc) {

        if (root == null) {
            return;
        }

        if (acc.size() < level + 1) {
            acc.add(new LinkedList<>());
        }

        acc.get(level).add(root.val);
        levelOrder(root.left, level + 1, acc);
        levelOrder(root.right, level + 1, acc);
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBST(nums, 0, nums.length - 1);
    }

    private TreeNode sortedArrayToBST(int[] nums, int start, int end) {

        if (nums == null) {
            return null;
        }
        if (start > end) {
            return null;
        }

        if (start == end) {
            // 1 element
            return new TreeNode(nums[start]);
        }
        // start < end
        int mid = (end + start) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = sortedArrayToBST(nums, start, mid - 1);
        root.right = sortedArrayToBST(nums, mid + 1, end);
        return root;
    }
}
