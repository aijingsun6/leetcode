package org.alking.p500;

import org.alking.common.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class P508 {

    public int[] findFrequentTreeSum(TreeNode root) {
        HashMap<Integer, Integer> map = new HashMap<>();
        dfs(root, map);
        int maxCnt = 0;
        ArrayList<Integer> acc = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxCnt) {
                acc.clear();
                acc.add(entry.getKey());
                maxCnt = entry.getValue();
            } else if (entry.getValue() == maxCnt) {
                acc.add(entry.getKey());
            }
        }
        int[] result = new int[acc.size()];
        for (int i = 0; i < acc.size(); i++) {
            result[i] = acc.get(i);
        }
        return result;
    }

    private int dfs(TreeNode root, HashMap<Integer, Integer> map) {
        int left = 0;
        if (root.left != null) {
            left = dfs(root.left, map);
        }
        int right = 0;
        if (root.right != null) {
            right = dfs(root.right, map);
        }
        int sum = root.val + left + right;
        map.put(sum, map.getOrDefault(sum, 0) + 1);
        return sum;
    }
}
