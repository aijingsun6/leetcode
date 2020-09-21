package org.alking.p500;

public class P538 {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


//    public TreeNode convertBST(TreeNode root) {
//        if (root == null) {
//            return null;
//        }
//        return convertBST(root, null, false);
//    }
//
//    private TreeNode convertBST(TreeNode root, TreeNode parent, boolean left) {
//        if (root.right != null) {
//            root.right = convertBST(root.right, root, false);
//            root.val = root.val + root.right.val;
//        }
//        if (left && parent != null) {
//            root.val = root.val + parent.val;
//        }
//        if (root.left != null) {
//            root.left = convertBST(root.left, root, true);
//        }
//        return root;
//    }

    int sum = 0;

    public TreeNode convertBST(TreeNode root) {
        if(root == null){
            return null;
        }
        convertBST(root.right);
        sum += root.val;
        root.val = sum;
        convertBST(root.left);
        return root;
    }
}
