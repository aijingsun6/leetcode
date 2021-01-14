package org.alking.stack;

import org.alking.common.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class InorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> acc = new LinkedList<>();

        if (root == null) {
            return acc;
        }

        Stack<TreeNode> stack = new Stack<>();

        while (!stack.isEmpty() || root != null) {

            if(root != null){
                // push
                while (root != null){
                    stack.push(root);
                    root = root.left;
                }

            }

            TreeNode n = stack.pop();
            acc.add(n.val);
            root = n.right;
        }
        return acc;
    }
}
