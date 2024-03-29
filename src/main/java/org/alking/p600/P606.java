package org.alking.p600;

import org.alking.common.TreeNode;

public class P606 {

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
