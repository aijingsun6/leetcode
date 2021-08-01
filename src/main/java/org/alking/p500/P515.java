package org.alking.p500;

import org.alking.common.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P515 {

    public List<Integer> largestValues(TreeNode root) {
        if(root == null){
            return Collections.emptyList();
        }
        List<Integer> acc = new ArrayList<>();
        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < size; i++) {
                TreeNode n = queue.removeFirst();
                max = Math.max(max, n.val);
                if (n.left != null) {
                    queue.addLast(n.left);
                }
                if (n.right != null) {
                    queue.addLast(n.right);
                }
            }
            acc.add(max);
        }
        return acc;
    }
}
