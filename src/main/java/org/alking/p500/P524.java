package org.alking.p500;

import java.util.List;

public class P524 {

    private static class Node {

        boolean leaf = false;
        Node[] map = new Node[26];
        String src;

        public Node get(int idx) {
            return map[idx];
        }

        Node() {

        }

    }

    private Node buildDic(List<String> dictionary) {
        Node root = new Node();
        for (String s : dictionary) {
            char[] arr = s.toCharArray();
            Node n = root;
            int idx;
            for (int i = 0; i < arr.length; i++) {
                idx = arr[i] - 'a';
                if (n.get(idx) == null) {
                    n.map[idx] = new Node();
                }
                n = n.get(idx);
            }
            n.leaf = true;
            n.src = s;
        }
        return root;

    }


    public String findLongestWord(String s, List<String> dictionary) {
        if (dictionary.isEmpty()) {
            return "";
        }
        res = "";
        Node root = buildDic(dictionary);
        dfs(s.toCharArray(), 0, root);
        return res;
    }

    private String res = "";

    private void dfs(char[] arr, int idx, Node n) {

        if (n == null) {
            return;
        }
        if (n.leaf && n.src.length() > res.length()) {
            res = n.src;
        } else if (n.leaf && n.src.length() == res.length() && n.src.compareTo(res) < 0) {
            res = n.src;
        }
        if (idx >= arr.length) {
            return;
        }
        int j = arr[idx] - 'a';
        if (n.get(j) != null) {
            dfs(arr, idx + 1, n.get(j));
        }
        dfs(arr, idx + 1, n);
    }

    public String findLongestWord2(String s, List<String> dictionary) {
        if (dictionary.isEmpty()) {
            return "";
        }
        String result = "";
        int[] array = new int[dictionary.size()];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            for(int j = 0 ; j < array.length;j++){
                String d = dictionary.get(j);
                if (array[j] < d.length() && d.charAt(array[j]) == c) {
                    array[j]++;
                    if (array[j] == d.length()){
                        if (d.length() > result.length()){
                            result = d;
                        }else if(d.length() == result.length() && d.compareTo(result) < 0){
                            result = d;
                        }
                    }
                }

            }
        }
        return result;
    }
}
