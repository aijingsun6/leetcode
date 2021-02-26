package org.alking.p1100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class P1178 {

    private static final int CACHE_SIZE = 'z' - 'a' + 2;
    private static final int FIRST_IDX = 'z' - 'a' + 1;

    public List<Integer> findNumOfValidWords(String[] words, String[] puzzles) {
        List<Integer> acc = new ArrayList<>();
        List<int[]> wordCacheList = Arrays.stream(words).map(x -> word2cache(x)).collect(Collectors.toList());
        List<int[]> puzzCacheList = Arrays.stream(puzzles).map(x -> word2cache(x)).collect(Collectors.toList());

        for (int[] puzz : puzzCacheList) {
            acc.add(calcNum(puzz,wordCacheList));
        }
        return acc;
    }

    private int[] word2cache(String word) {
        int[] ret = new int[CACHE_SIZE];
        //
        char f = word.charAt(0);
        ret[f - 'a']++;
        ret[FIRST_IDX] = f - 'a';

        for (int i = 1; i < word.length(); i++) {
            char c = word.charAt(i);
            ret[c - 'a']++;
        }
        return ret;
    }

    private int calcNum(int[] puzz, List<int[]> words) {
        int acc = 0;
        for (int[] w : words) {
            if (isPuzz(puzz, w)) {
                acc++;
            }
        }
        return acc;
    }

    private boolean isPuzz(int[] puzz, int[] word) {
        // check first char
        if (word[puzz[FIRST_IDX]] < 1) {
            return false;
        }
        int max = 'z' - 'a' + 1;
        for (int i = 0; i < max; i++) {
            if (word[i] > 0 && puzz[i] < 1) {
                return false;
            }
        }
        return true;
    }
}
