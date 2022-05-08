package org.alking.p700;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class P726 {

    public static class FormulaNode {

        private final HashMap<String, Integer> cntMap = new HashMap<>();

        private final HashMap<FormulaNode, Integer> childMap = new HashMap<>();

        public FormulaNode() {

        }

        private int[] readCnt(String formula, int start) {
            if (start >= formula.length()) {
                return new int[]{1, start};
            }
            if (!Character.isDigit(formula.charAt(start))) {
                return new int[]{1, start};
            }

            int idx = start;
            while (idx < formula.length() && Character.isDigit(formula.charAt(idx))) {
                idx++;
            }
            int count = Integer.valueOf(formula.substring(start, idx));
            return new int[]{count, idx};
        }

        public int readFrom(String formula, int start) {
            int idx = start;
            int max = formula.length();
            while (idx < max) {

                if (formula.charAt(idx) == ')') {
                    idx += 1;
                    break;
                }

                if (Character.isUpperCase(formula.charAt(idx))) {
                    // 大写字母，是元素
                    int idx2 = idx + 1;
                    while (idx2 < max && Character.isLowerCase(formula.charAt(idx2))) {
                        idx2++;
                    }
                    String element = formula.substring(idx, idx2);
                    idx = idx2;

                    int[] cnt = readCnt(formula, idx);
                    int count = cnt[0];
                    idx = cnt[1];
                    this.cntMap.put(element, this.cntMap.getOrDefault(element, 0) + count);
                }

                if (idx < max && formula.charAt(idx) == '(') {
                    FormulaNode node = new FormulaNode();
                    idx = node.readFrom(formula, idx + 1);
                    int[] cnt = readCnt(formula, idx);
                    int count = cnt[0];
                    idx = cnt[1];
                    this.childMap.put(node, count);
                }
            }
            return idx;
        }

        public TreeMap<String, Integer> getCnt() {
            TreeMap<String, Integer> acc = new TreeMap<>();

            for (Map.Entry<String, Integer> entry : cntMap.entrySet()) {
                acc.put(entry.getKey(), entry.getValue());
            }

            for (Map.Entry<FormulaNode, Integer> fm : childMap.entrySet()) {
                TreeMap<String, Integer> child = fm.getKey().getCnt();
                int multi = fm.getValue();
                for (Map.Entry<String, Integer> e : child.entrySet()) {
                    acc.put(e.getKey(), acc.getOrDefault(e.getKey(), 0) + e.getValue() * multi);
                }
            }
            return acc;
        }
    }

    public String countOfAtoms(String formula) {
        FormulaNode node = new FormulaNode();
        node.readFrom(formula, 0);
        TreeMap<String, Integer> cnt = node.getCnt();
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Integer> e : cnt.entrySet()) {
            if (e.getValue() > 1) {
                sb.append(e.getKey()).append(String.valueOf(e.getValue()));
            } else {
                sb.append(e.getKey());
            }

        }
        return sb.toString();
    }
}
