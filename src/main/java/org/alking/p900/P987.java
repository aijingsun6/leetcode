package org.alking.p900;

import org.alking.common.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P987 {

    interface Consumer {
        void consume(TreeNode node, int row, int col);
    }

    private int colMin = 0;
    private int colMax = 0;

    private ArrayList<Integer>[] bucket;

    public List<List<Integer>> verticalTraversal(TreeNode root) {

        if (root == null) {
            return Collections.emptyList();
        }
        colMin = 0;
        colMax = 0;
        inorder(root, 0, 0, new Consumer() {
            @Override
            public void consume(TreeNode node, int row, int col) {
                colMin = Math.min(colMin, col);
                colMax = Math.max(colMax, col);
            }
        });

        bucket = new ArrayList[colMax - colMin + 1];

        inorder(root, 0, 0, new Consumer() {
            @Override
            public void consume(TreeNode node, int row, int col) {
                int idx = col - colMin;
                if (bucket[idx] == null) {
                    bucket[idx] = new ArrayList<>();
                }
                bucket[idx].add(node.val);
            }
        });

        List<List<Integer>> acc = new ArrayList<>();
        for (int i = 0; i < bucket.length; i++) {
            if (bucket[i] != null) {
                acc.add(bucket[i]);
            }
        }
        return acc;

    }

    private void inorder(TreeNode node, int row, int col, Consumer consumer) {
        consumer.consume(node, row, col);

        if (node.left != null) {
            inorder(node.left, row + 1, col - 1, consumer);
        }

        if (node.right != null) {
            inorder(node.right, row + 1, col + 1, consumer);
        }
    }
}
