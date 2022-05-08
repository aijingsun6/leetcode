package org.alking.mian;

/**
 * https://leetcode-cn.com/problems/sparse-array-search-lcci/
 */
public class M1005 {

    private int binarySearch(String[] words, String s, int left, int right) {
        if (left > right) {
            return -1;
        }
        if (left == right) {
            if (left < words.length) {
                return words[left].equals(s) ? left : -1;
            }
            return -1;
        }
        int mid = left + (right - left) / 2;
        if (words[mid].equals("")) {
            int l = binarySearch(words, s, left, mid);
            int r = binarySearch(words, s, mid + 1, right);
            if (l > -1) {
                return l;
            }
            if (r > -1) {
                return r;
            }
            return -1;
        }
        if (s.compareTo(words[mid]) < 0) {
            return binarySearch(words, s, left, mid);
        } else if (s.compareTo(words[mid]) > 0) {
            return binarySearch(words, s, mid + 1, right);
        } else {
            return mid;
        }
    }

    public int findString(String[] words, String s) {
        return binarySearch(words, s, 0, words.length);
    }
}
