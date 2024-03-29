package org.alking.p300;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P336_2 {

    public static class Node {
        int[] ch = new int[26];
        int flag;

        public Node() {
            flag = -1;
        }
    }

    public static class Trie {

        List<Node> tree = new ArrayList<Node>();

        public Trie() {
            tree.add(new Node());
        }

        public void insert(String s, int id) {
            int len = s.length(), add = 0;
            for (int i = 0; i < len; i++) {
                int x = s.charAt(i) - 'a';
                if (tree.get(add).ch[x] == 0) {
                    tree.add(new Node());
                    tree.get(add).ch[x] = tree.size() - 1;
                }
                add = tree.get(add).ch[x];
            }
            tree.get(add).flag = id;
        }

        public int[] query(String s) {
            int len = s.length(), add = 0;
            int[] ret = new int[len + 1];
            Arrays.fill(ret, -1);
            for (int i = 0; i < len; i++) {
                ret[i] = tree.get(add).flag;
                int x = s.charAt(i) - 'a';
                if (tree.get(add).ch[x] == 0) {
                    return ret;
                }
                add = tree.get(add).ch[x];
            }
            ret[len] = tree.get(add).flag;
            return ret;
        }
    }


    public List<List<Integer>> palindromePairs(String[] words) {
        Trie trie1 = new Trie();
        Trie trie2 = new Trie();

        int n = words.length;
        for (int i = 0; i < n; i++) {
            trie1.insert(words[i], i);
            StringBuffer tmp = new StringBuffer(words[i]);
            tmp.reverse();
            trie2.insert(tmp.toString(), i);
        }

        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        for (int i = 0; i < n; i++) {
            int[][] rec = manacher(words[i]);

            int[] id1 = trie2.query(words[i]);
            words[i] = new StringBuffer(words[i]).reverse().toString();
            int[] id2 = trie1.query(words[i]);

            int m = words[i].length();

            int allId = id1[m];
            if (allId != -1 && allId != i) {
                ret.add(Arrays.asList(i, allId));
            }
            for (int j = 0; j < m; j++) {
                if (rec[j][0] != 0) {
                    int leftId = id2[m - j - 1];
                    if (leftId != -1 && leftId != i) {
                        ret.add(Arrays.asList(leftId, i));
                    }
                }
                if (rec[j][1] != 0) {
                    int rightId = id1[j];
                    if (rightId != -1 && rightId != i) {
                        ret.add(Arrays.asList(i, rightId));
                    }
                }
            }
        }
        return ret;
    }

    public int[][] manacher(String s) {
        int n = s.length();
        StringBuffer tmp = new StringBuffer("#");
        for (int i = 0; i < n; i++) {
            if (i > 0) {
                tmp.append('*');
            }
            tmp.append(s.charAt(i));
        }
        tmp.append('!');
        int m = n * 2;
        int[] len = new int[m];
        int[][] ret = new int[n][2];
        int p = 0, maxn = -1;
        for (int i = 1; i < m; i++) {
            len[i] = maxn >= i ? Math.min(len[2 * p - i], maxn - i) : 0;
            while (tmp.charAt(i - len[i] - 1) == tmp.charAt(i + len[i] + 1)) {
                len[i]++;
            }
            if (i + len[i] > maxn) {
                p = i;
                maxn = i + len[i];
            }
            if (i - len[i] == 1) {
                ret[(i + len[i]) / 2][0] = 1;
            }
            if (i + len[i] == m - 1) {
                ret[(i - len[i]) / 2][1] = 1;
            }
        }
        return ret;
    }
}

