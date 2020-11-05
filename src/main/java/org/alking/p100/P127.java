package org.alking.p100;

import java.util.*;

public class P127 {


    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> wordSet = new HashSet<>(wordList);
        if (beginWord.length() != endWord.length()) {
            return 0;
        }

        if (isLadder(beginWord, endWord)) {
            return 2;
        }
        int acc = 0;
        ArrayList<String> queue = new ArrayList<>();
        queue.add(beginWord);

        while (!queue.isEmpty()) {
            ArrayList<String> list = queue;
            queue = new ArrayList<>();
            acc += 1;
            wordSet.removeAll(list);
            for (String poll : list) {
                if (poll.equals(endWord)) {
                    return acc;
                }
                for (String s : wordSet) {
                    if (isLadder(poll, s)) {
                        queue.add(s);
                    }
                }
            }
        }
        return 0;
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
