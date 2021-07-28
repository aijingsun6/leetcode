package org.alking.p800;

import org.alking.common.TreeNode;

import java.util.*;
import java.util.stream.Collectors;

public class P863 {

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        if (root == null) {
            return Collections.emptyList();
        }
        if (k == 0) {
            return Arrays.asList(target.val);
        }
        HashMap<TreeNode, TreeNode> parentMap = new HashMap<>();
        buildParent(root, null, parentMap);
        // 使用广度优先遍历
        HashSet<TreeNode> visit = new HashSet<>();
        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
        int dist = 0;
        queue.addLast(target);
        visit.add(target);
        List<TreeNode> nodes = new ArrayList<>();
        boolean loop = true;
        while (!queue.isEmpty() && loop) {
            int size = queue.size();
            dist = dist + 1;
            for (int i = 0; i < size; i++) {
                TreeNode n = queue.removeFirst();
                if (n.left != null && !visit.contains(n.left)) {
                    queue.addLast(n.left);
                    visit.add(n.left);
                }
                if (n.right != null && !visit.contains(n.right)) {
                    queue.addLast(n.right);
                    visit.add(n.right);
                }
                TreeNode p = parentMap.getOrDefault(n, null);
                if (p != null && !visit.contains(p)) {
                    queue.addLast(p);
                    visit.add(p);
                }
            }
            if (dist == k) {
                nodes = new ArrayList<>(queue);
                loop = false;
            }
        }


        return nodes.stream().map(x -> x.val).collect(Collectors.toList());
    }

    private void buildParent(TreeNode node, TreeNode parent, HashMap<TreeNode, TreeNode> acc) {
        if (parent != null) {
            acc.put(node, parent);
        }
        if (node.left != null) {
            buildParent(node.left, node, acc);
        }
        if (node.right != null) {
            buildParent(node.right, node, acc);
        }
    }

}
