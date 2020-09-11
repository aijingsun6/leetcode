package org.alking.p600;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class P637 {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<Double> averageOfLevels(TreeNode root) {


        List<Double> acc = new ArrayList<>();
        if (root == null) {
            return acc;
        }

        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
        queue.addLast(root);


        List<TreeNode> list = new ArrayList<>();
        while (!queue.isEmpty()) {

            list.clear();
            double sum = 0;
            int count = 0;
            TreeNode n;
            while (!queue.isEmpty()) {
                n = queue.removeFirst();
                sum += n.val;
                count += 1;
                if (n.left != null) {
                    list.add(n.left);
                }
                if (n.right != null) {
                    list.add(n.right);
                }
            }
            queue.addAll(list);
            acc.add(sum / count);
        }

        return acc;
    }

}
