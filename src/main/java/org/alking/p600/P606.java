package org.alking.p600;

public class P606 {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public String tree2str(TreeNode t) {
        if (t == null) {
            return "";
        }
        if(t.left == null && t.right == null){
            return String.valueOf(t.val);
        }
        String left = "()";
        if(t.left != null){
            left = "(" + tree2str(t.left) + ")";
        }
        String right = "";
        if(t.right != null){
            right = "(" + tree2str(t.right) + ")";
        }
        return String.format("%d%s%s",t.val,left,right);

    }
}
