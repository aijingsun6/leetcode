package org.alking.p800;

import org.alking.common.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P894 {


    public List<TreeNode> allPossibleFBT(int n) {
        if (n % 2 == 0) {
            return Collections.emptyList();
        }
        List<TreeNode>[] dp = new List[n + 1];
        dp[1] = Arrays.asList(new TreeNode());
        for (int i = 3; i <= n; i += 2) {
            List<TreeNode> list = new ArrayList<>();
            for (int left = 1; left < i; left += 2) {
                int right = i - 1 - left;
                for (TreeNode l : dp[left]) {
                    for (TreeNode r : dp[right]) {
                        TreeNode node = new TreeNode();
                        node.left = l;
                        node.right = r;
                        list.add(node);
                    }
                }
            }
            dp[i] = list;
        }
        return dp[n];
    }


}
