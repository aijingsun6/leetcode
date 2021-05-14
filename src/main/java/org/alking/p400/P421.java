package org.alking.p400;

import java.util.ArrayList;
import java.util.Collections;

public class P421 {

    private static final int SIZE = 2;

    public static class NumNode {

        private boolean leaf = false;

        private NumNode[] dict = new NumNode[SIZE];

        private int maxDepth;

        private int value;

        public NumNode(int max) {
            this.maxDepth = Integer.toBinaryString(max).length();
        }

        private NumNode() {

        }

        private void insert(int v) {
            String s = Integer.toBinaryString(v);
            NumNode n = this;
            int pad = maxDepth - s.length();
            for (int i = 0; i < pad; i++) {
                if (n.dict[0] == null) {
                    n.dict[0] = new NumNode();
                }
                n = n.dict[0];
            }
            for (int i = 0; i < s.length(); i++) {
                int idx = s.charAt(i) == '0' ? 0 : 1;
                if (n.dict[idx] == null) {
                    n.dict[idx] = new NumNode();
                }
                n = n.dict[idx];
            }
            n.leaf = true;
            n.value = v;
        }

        public int maxXOR() {
            return maxXOR(this);
        }

        private int maxXOR(NumNode node) {
            NumNode n1 = node.dict[0];
            NumNode n2 = node.dict[1];

            if (n1 != null && n2 != null) {
                return maxXOR(n1, n2);
            }
            if (n1 != null) {
                return maxXOR(n1);
            }
            if (n2 != null) {
                return maxXOR(n2);
            }
            return 0;
        }

        private int maxXOR(NumNode n1, NumNode n2) {
            if (n1 == null || n2 == null) {
                return 0;
            }
            if (n1.leaf && n2.leaf) {
                return n1.value ^ n2.value;
            }
            ArrayList<Integer> acc = new ArrayList<>();

            NumNode n11 = n1.dict[0];
            NumNode n12 = n1.dict[1];
            NumNode n21 = n2.dict[0];
            NumNode n22 = n2.dict[1];


            if (n11 != null && n22 != null) {
                acc.add(maxXOR(n11, n22));
            }
            if (n12 != null && n21 != null) {
                acc.add(maxXOR(n12, n21));
            }

            if (acc.isEmpty()) {
                if (n11 != null && n21 != null) {
                    acc.add(maxXOR(n11, n21));
                }
                if (n12 != null && n22 != null) {
                    acc.add(maxXOR(n12, n22));
                }
            }
            if (acc.isEmpty()) {
                return 0;
            }
            return Collections.max(acc);
        }


    }


    public int findMaximumXOR(int[] nums) {

        int max = nums[0];
        for (int n : nums) {
            max = Math.max(n, max);
        }
        NumNode nn = new NumNode(max);
        for (int n : nums) {
            nn.insert(n);
        }
        return nn.maxXOR();
    }

}
