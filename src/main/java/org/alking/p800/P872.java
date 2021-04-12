package org.alking.p800;

import org.alking.common.TreeNode;

import java.util.ArrayList;
import java.util.Stack;

public class P872 {


    private void parse(TreeNode root, ArrayList<Integer> acc) {

        if (root.left == null && root.right == null) {
            acc.add(root.val);
            return;
        }
        if (root.left != null) {
            parse(root.left, acc);
        }
        if (root.right != null) {
            parse(root.right, acc);
        }

    }

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> acc1 = new ArrayList<>();
        parse(root1, acc1);

        ArrayList<Integer> acc2 = new ArrayList<>();
        parse(root2, acc2);
        if (acc1.size() != acc2.size()) {
            return false;
        }
        for (int i = 0; i < acc1.size(); i++) {
            if (!acc1.get(i).equals(acc2.get(i))) {
                return false;
            }
        }
        return true;
    }


    public static class TreeNodeGenerator {

        private Stack<TreeNode> stack = new Stack<>();

        private TreeNode p = null;

        TreeNodeGenerator(TreeNode root) {
            this.p = root;
        }

        public TreeNode next() {
            while (p != null || !stack.isEmpty()) {
                while (p != null) {
                    stack.push(p);
                    p = p.left;
                }
                // p = null
                if (!stack.isEmpty()) {
                    TreeNode q = stack.pop();
                    if (q.left == null && q.right == null) {
                        return q;
                    }
                    if (q.right != null) {
                        p = q.right;
                    }
                }
            }
            return null;
        }
    }

    public boolean leafSimilar2(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        TreeNodeGenerator g1 = new TreeNodeGenerator(root1);
        TreeNodeGenerator g2 = new TreeNodeGenerator(root2);
        while (true){
            TreeNode n1 = g1.next();
            TreeNode n2 = g2.next();
            if(n1 != null && n2 != null){
                if(n1.val != n2.val){
                    return false;
                }
            }else if(n1 == null && n2 == null){
                return true;
            }else {
                return false;
            }
        }
    }
}
