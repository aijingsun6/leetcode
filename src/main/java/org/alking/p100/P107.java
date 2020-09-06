package org.alking.p100;

import java.util.*;

public class P107 {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    public List<List<Integer>> levelOrderBottom(TreeNode root) {

        if (root == null) {
            return Collections.emptyList();
        }

        TreeMap<Integer, List<Integer>> acc = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        levelOrderBottom(acc, root, 1);

        ArrayList<List<Integer>> result = new ArrayList<>();
        for(Map.Entry<Integer,List<Integer>> entry: acc.entrySet()){
            result.add( entry.getValue());
        }
        return result;
    }

    private void levelOrderBottom(TreeMap<Integer, List<Integer>> acc, TreeNode root, int level) {

        if (root == null) {
            return;
        }

        List<Integer> list = acc.getOrDefault(level, new ArrayList<>());
        list.add(root.val);
        acc.put(level, list);
        if (root.left != null) {
            levelOrderBottom(acc, root.left, level + 1);
        }
        if (root.right != null) {
            levelOrderBottom(acc, root.right, level + 1);
        }

    }

}
