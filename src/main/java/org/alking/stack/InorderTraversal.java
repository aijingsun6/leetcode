package org.alking.stack;

import org.alking.tree.TreeNode;

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
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            acc.add(node.val);
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
        return acc;
    }
}
