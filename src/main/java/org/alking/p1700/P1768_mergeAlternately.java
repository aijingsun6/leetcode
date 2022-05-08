package org.alking.p1700;

/**
 * https://leetcode-cn.com/problems/merge-strings-alternately/
 */
public class P1768_mergeAlternately {

    public String mergeAlternately(String word1, String word2) {

        char[] arr1 = word1.toCharArray();
        char[] arr2 = word2.toCharArray();
        int min = Math.min(arr1.length, arr2.length);
        char[] buffer = new char[arr1.length + arr2.length];
        int offset = 0;
        for (int i = 0; i < min; i++) {
            buffer[offset++] = arr1[i];
            buffer[offset++] = arr2[i];
        }

        if (arr1.length > arr2.length) {
            for (int i = min; i < arr1.length; i++) {
                buffer[offset++] = arr1[i];
            }
        } else if (arr1.length < arr2.length) {
            for (int i = min; i < arr2.length; i++) {
                buffer[offset++] = arr2[i];
            }
        }

        return new String(buffer);
    }
}
