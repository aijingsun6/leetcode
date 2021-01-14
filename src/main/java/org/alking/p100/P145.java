package org.alking.p100;

import org.alking.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class P145 {

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> acc = new ArrayList<>();
        postorderTraversal(root,acc);
        return acc;

    }

    private void postorderTraversal(TreeNode root,List<Integer> acc){
        if(root == null){
            return;
        }

        postorderTraversal(root.left,acc);
        postorderTraversal(root.right,acc);
        acc.add(root.val);
    }


}
