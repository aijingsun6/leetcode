package org.alking.p100;

import org.alking.common.TreeNode;

import java.util.*;

public class P103 {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }
        List<List<Integer>> result = new ArrayList<>();
        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
        boolean right = true;
        queue.addLast(root);
        int size = 0;
        while ((size = queue.size()) > 0) {
            LinkedList<Integer> add = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                TreeNode n = queue.pollFirst();
                if (n.left != null) {
                    queue.addLast(n.left);
                }
                if (n.right != null) {
                    queue.addLast(n.right);
                }
                if (right) {
                    add.addLast(n.val);
                } else {
                    add.addFirst(n.val);
                }

            }
            result.add(add);
            right = !right;
        }
        return result;
    }
}
