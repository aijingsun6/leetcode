package org.alking.p1600;

import org.alking.common.TreeNode;

import java.util.ArrayDeque;


public class P1609 {


    public boolean isEvenOddTree(TreeNode root) {
        // bfs
        if (root == null) {
            return false;
        }
        ArrayDeque<TreeNode> q = new ArrayDeque<>();
        q.addLast(root);
        int level = 0;
        while (!q.isEmpty()) {
            int s = q.size();
            TreeNode prev = null;
            for (int i = 0; i < s; i++) {
                TreeNode n = q.removeFirst();
                if(level % 2 == 0 && n.val %2 == 0){
                    return false;
                }
                if(level %2 == 1 && n.val %2 == 1){
                    return false;
                }
                if (prev != null && level % 2 == 0 && n.val <= prev.val) {
                    return false;
                }

                if (prev != null && level % 2 == 1 && n.val >= prev.val) {
                    return false;
                }
                prev = n;
                if (n.left != null) {
                    q.addLast(n.left);
                }
                if (n.right != null) {
                    q.addLast(n.right);
                }

            }
            level++;
        }
        return true;
    }


}
