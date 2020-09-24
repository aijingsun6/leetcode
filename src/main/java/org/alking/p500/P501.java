package org.alking.p500;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P501 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public int[] findMode(TreeNode root) {

        if (root == null) {
            return new int[0];
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        foreach(root, map);

        List<Integer> list = new ArrayList<>();
        int max = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            int v = entry.getKey();
            int c = entry.getValue();
            if (c > max) {
                list.clear();
                list.add(v);
                max = c;
            } else if (c == max) {
                list.add(v);
            }

        }
        int[] result = new int[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }
        return result;
    }


    private void foreach(TreeNode root, HashMap<Integer, Integer> map) {
        if (root.left != null) {
            foreach(root.left, map);
        }
        map.put(root.val, map.getOrDefault(root.val, 0) + 1);
        if (root.right != null) {
            foreach(root.right, map);
        }
    }
}
