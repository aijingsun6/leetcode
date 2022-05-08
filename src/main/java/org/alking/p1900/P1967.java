package org.alking.p1900;

/**
 * https://leetcode-cn.com/problems/number-of-strings-that-appear-as-substrings-in-word/
 */
public class P1967 {

    public int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for(String p : patterns){
            if(word.contains(p))
                count++;
        }
        return count;
    }
}
