package org.alking.p0;

import org.alking.common.TreeNode;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class P95 {

    public List<TreeNode> generateTrees(int n) {

        if (n < 1) {
            return Collections.emptyList();
        }
        return generateTrees(1, n);
    }

    private List<TreeNode> generateTrees(int start, int end) {

        List<TreeNode> acc = new LinkedList<TreeNode>();
        if (start > end) {
            acc.add(null);
            return acc;
        }
        if (start == end) {
            acc.add(new TreeNode(start));
            return acc;
        }

        for (int i = start; i <= end; i++) {
            // 获得所有可行的左子树集合
            List<TreeNode> leftTrees = generateTrees(start, i - 1);

            // 获得所有可行的右子树集合
            List<TreeNode> rightTrees = generateTrees(i + 1, end);

            // 从左子树集合中选出一棵左子树，从右子树集合中选出一棵右子树，拼接到根节点上
            for (TreeNode left : leftTrees) {
                for (TreeNode right : rightTrees) {
                    TreeNode currTree = new TreeNode(i);
                    currTree.left = left;
                    currTree.right = right;
                    acc.add(currTree);
                }
            }
        }
        return acc;
    }
}
