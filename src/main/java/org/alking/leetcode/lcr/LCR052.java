package org.alking.leetcode.lcr;

import org.alking.leetcode.common.TreeNode;

import java.util.Stack;

public class LCR052 {

    public TreeNode increasingBST(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        dfs(root, stack);
        TreeNode last = null;
        while (!stack.isEmpty()){
            if(last == null){
                last = stack.pop();
                last.left = null;
                last.right = null;
            }else{
                TreeNode node = stack.pop();
                node.left = null;
                node.right = last;
                last = node;
            }
        }
        return last;
    }

    private void dfs(TreeNode node, Stack<TreeNode> stack){
        if(node.left != null){
            dfs(node.left, stack);
        }

        stack.add(node);

        if(node.right != null){
            dfs(node.right,stack);
        }

    }
}
