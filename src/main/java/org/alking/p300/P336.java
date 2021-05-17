package org.alking.p300;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P336 {

    private static final int SIZE = 'z' - 'a' + 1;

    public static class TrieNode {

        private boolean leaf = false;

        private String word;

        private int index = 0;

        private char c;

        private TrieNode[] map = new TrieNode[SIZE];

        public TrieNode() {

        }

        public void insert(final int index, final String word) {
            if (word.isEmpty()) {
                return;
            }
            TrieNode node = this;
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                int idx = c - 'a';
                if (node.map[idx] == null) {
                    node.map[idx] = new TrieNode();
                    node.map[idx].c = c;
                }
                node = node.map[idx];

            }
            node.leaf = true;
            node.word = word;
            node.index = index;
        }
    }

    private List<List<Integer>> acc = new ArrayList<>();

    private boolean isPalin(final String s) {
        return isPalin(s.toCharArray(), 0, s.length());
    }

    private boolean isPalin(char[] arr, int start, int end) {
        int left = start;
        int right = end - 1;
        while (left < right) {
            if (arr[left] != arr[right]) {
                return false;
            }
            left += 1;
            right -= 1;
        }
        return true;
    }


    private int maxSize = 0;
    private List<Integer> dfsAcc = new ArrayList<>();
    char[] dfsArr;
    int dfsSize = 0;

    private List<Integer> dfs(TrieNode node) {
        dfsAcc = new ArrayList<>();
        dfsArr = new char[maxSize];
        dfsSize = 0;
        procDfs(node);
        return dfsAcc;
    }

    private void procDfs(TrieNode node) {
        if (node.leaf) {
            if (isPalin(dfsArr, 0, dfsSize)) {
                dfsAcc.add(node.index);
            }
            return;
        }

        for (int i = 0; i < SIZE; i++) {
            TrieNode n = node.map[i];
            if (n != null) {
                dfsArr[dfsSize++] = (char) ('a' + i);
                procDfs(n);
                dfsSize--;
            }
        }
    }

    private void proc(TrieNode node, TrieNode revNode) {

        if (node.leaf && revNode.leaf) {
            // 理想情况
            acc.add(Arrays.asList(node.index, revNode.index));
            return;
        }
        for (int i = 0; i < SIZE; i++) {
            TrieNode n = node.map[i];
            TrieNode rn = revNode.map[i];

            if (n != null && rn != null) {
                proc(n, rn);
                continue;
            }
            if (n == null && rn == null) {
                continue;
            }
            if (n == null) {
                List<Integer> dfs = dfs(rn);
                for (int j : dfs) {
                    if (node.index != j) {
                        acc.add(Arrays.asList(node.index, j));
                    }
                }
            } else {
                List<Integer> dfs = dfs(n);
                for (int j : dfs) {
                    if (j != revNode.index) {
                        acc.add(Arrays.asList(j, revNode.index));
                    }
                }
            }

        }

    }


    public List<List<Integer>> palindromePairs(String[] words) {
        this.acc = new ArrayList<>();
        TrieNode node = new TrieNode();
        TrieNode reverseNode = new TrieNode();
        int emptyIdx = -1;
        maxSize = 0;
        for (int i = 0; i < words.length; i++) {
            String w = words[i];
            if (w.isEmpty()) {
                emptyIdx = i;
            } else {
                maxSize = Math.max(maxSize, w.length());
                node.insert(i, w);
                String rw = new StringBuilder(w).reverse().toString();
                reverseNode.insert(i, rw);
            }
        }

        if (emptyIdx > -1) {
            for (int i = 0; i < words.length; i++) {
                String w = words[i];
                if (!w.isEmpty() && isPalin(w)) {
                    acc.add(Arrays.asList(emptyIdx, i));
                    acc.add(Arrays.asList(i, emptyIdx));
                }
            }
        }
        proc(node, reverseNode);
        return acc;
    }
}
