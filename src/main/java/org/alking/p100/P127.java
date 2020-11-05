package org.alking.p100;

import java.util.*;

public class P127 {


    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if (beginWord.length() != endWord.length()) {
            return 0;
        }

        if (isLadder(beginWord, endWord)) {
            return 2;
        }

        HashMap<String, ArrayList<String>> ladderMap = buildLadderMap(beginWord, wordList);
        int acc = 0;
        ArrayDeque<String> queue = new ArrayDeque<>();
        queue.add(beginWord);
        HashSet<String> visit = new HashSet<>();
        visit.add(beginWord);

        while (!queue.isEmpty()) {
            int size = queue.size();
            acc += 1;
            for (int i = 0; i < size; i++) {
                String poll = queue.poll();
                if (endWord.equals(poll)) {
                    return acc;
                }
                ArrayList<String> list = ladderMap.get(poll);
                if (list != null && !list.isEmpty()) {
                    for (String s : list) {
                        if (!visit.contains(s)) {
                            queue.add(s);
                            visit.add(s);
                        }
                    }
                }
            }
        }
        return 0;
    }

    private HashMap<String, ArrayList<String>> buildLadderMap(String beginWord, List<String> wordList) {
        HashMap<String, ArrayList<String>> acc = new HashMap<String, ArrayList<String>>();
        int size = wordList.size();
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                String s1 = wordList.get(i);
                String s2 = wordList.get(j);
                if (isLadder(s1, s2)) {
                    ArrayList<String> l1 = acc.getOrDefault(s1, new ArrayList<>());
                    l1.add(s2);
                    acc.put(s1, l1);

                    ArrayList<String> l2 = acc.getOrDefault(s2, new ArrayList<>());
                    l2.add(s1);
                    acc.put(s2, l2);
                }
            }
        }
        ArrayList<String> list = new ArrayList<>();
        for (String s : wordList) {
            if (isLadder(beginWord, s)) {
                list.add(s);
            }
        }
        acc.put(beginWord, list);
        return acc;

    }

    private boolean isLadder(String from, String to) {

        if (from.length() != to.length()) {
            return false;
        }
        int diff = 0;
        for (int i = 0; i < from.length(); i++) {
            if (from.charAt(i) != to.charAt(i)) {
                diff++;
            }
            if (diff > 1) {
                return false;
            }
        }
        return true;
    }


}
