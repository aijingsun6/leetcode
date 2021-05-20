package org.alking.p300;

import java.util.*;

public class P336 {

    public static class TrieNode {

        private boolean leaf = false;

        private String word;

        private int index = 0;

        private char c;

        private int charIdx;

        private HashMap<Character, TrieNode> map = new HashMap<>();

        public TrieNode() {

        }

        public void insert(final int index, final String word) {
            if (word.isEmpty()) {
                return;
            }
            TrieNode node = this;
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if (!node.map.containsKey(c)) {
                    TrieNode n = new TrieNode();
                    n.c = c;
                    n.charIdx = i;
                    node.map.put(c, n);
                    node = n;
                } else {
                    node = node.map.get(c);
                }
            }
            node.leaf = true;
            node.word = word;
            node.index = index;
        }
    }

    private List<List<Integer>> acc = new ArrayList<>();

    private boolean isPalin(final String s) {
        return isPalin(s, 0, s.length());
    }

    private boolean isPalin(final String s, final int start, final int end) {
        int left = start;
        int right = end - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left += 1;
            right -= 1;
        }
        return true;
    }


    private List<Integer> dfs(TrieNode node) {
        ArrayList<Integer> acc = new ArrayList<>();
        procDfs(node, node, acc);
        return acc;
    }

    private void procDfs(TrieNode root, TrieNode node, List<Integer> acc) {
        if (node.leaf) {
            if (isPalin(node.word, root.charIdx, node.word.length())) {
                acc.add(node.index);
            }
        }
        for(Map.Entry<Character,TrieNode> e: node.map.entrySet()){
            procDfs(root, e.getValue(), acc);
        }
    }

    private void addAcc(int i,int j){
        if(i == j){
            return;
        }
        acc.add(Arrays.asList(i, j));
    }

    private void proc(TrieNode node, TrieNode revNode) {

        if (node.leaf && revNode.leaf) {
            // 理想情况
            addAcc(node.index, revNode.index);
        }
        if (node.leaf) {
            // node 是叶子,只需要判断revNode的子节点即可
            for (Map.Entry<Character, TrieNode> e : revNode.map.entrySet()) {
                List<Integer> dfs = dfs(e.getValue());
                for (int j : dfs) {
                    addAcc(node.index, j);
                }
            }
        }

        if (revNode.leaf) {
            for (Map.Entry<Character, TrieNode> e : node.map.entrySet()) {
                List<Integer> dfs = dfs(e.getValue());
                for (int j : dfs) {
                    addAcc(j, revNode.index);
                }
            }
        }

        for (Map.Entry<Character, TrieNode> e : node.map.entrySet()) {
            if (revNode.map.containsKey(e.getKey())) {
                proc(e.getValue(), revNode.map.get(e.getKey()));
            }
        }
    }


    public List<List<Integer>> palindromePairs(String[] words) {
        this.acc = new ArrayList<>();
        TrieNode node = new TrieNode();
        TrieNode reverseNode = new TrieNode();
        int emptyIdx = -1;
        for (int i = 0; i < words.length; i++) {
            String w = words[i];
            if (w.isEmpty()) {
                emptyIdx = i;
            } else {
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
