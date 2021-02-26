package org.alking.p1100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class P1178 {

    public List<Integer> findNumOfValidWords(String[] words, String[] puzzles) {
        List<WordHash> pl = Arrays.stream(puzzles).map(x -> toHash(x)).collect(Collectors.toList());
        List<WordHash> wl = Arrays.stream(words).map(x -> toHash(x)).collect(Collectors.toList());
        List<Integer> acc = new ArrayList<>();
        for (WordHash p : pl) {
            acc.add(calcNum(p, wl));
        }
        return acc;
    }

    public WordHash toHash(String s) {
        int firstIdx = s.charAt(0) - 'a';
        int hash = 0;
        int shift;
        for (int i = 0; i < s.length(); i++) {
            shift = s.charAt(i) - 'a';
            hash |= 1 << shift;
        }
        return new WordHash(firstIdx, hash);
    }


    public boolean isAnswer(WordHash puzz, WordHash word) {

        // check first
        if ((word.hash & (1 << puzz.firstIdx)) < 1) {
            return false;
        }
        return puzz.hash == (puzz.hash | word.hash);
    }

    public int calcNum(WordHash puzz, List<WordHash> words) {
        int acc = 0;
        for (WordHash w : words) {
            if (isAnswer(puzz, w)) {
                acc++;
            }
        }
        return acc;
    }

    public static class WordHash {

        int firstIdx;
        int hash;

        public WordHash(int firstIdx, int hash) {
            this.firstIdx = firstIdx;
            this.hash = hash;
        }

    }


}
