package org.alking.p800;

public class P859 {

    public boolean buddyStrings(String A, String B) {
        if (A.length() != B.length()) return false;
        int[] countArr = new int['z' - 'a' + 1];
        boolean countGTE2 = false;
        int[] array = new int['z' - 'a' + 1];
        int diff = 0;
        for (int i = 0; i < A.length(); i++) {

            int idxA = A.charAt(i) - 'a';
            int idxB = B.charAt(i) - 'a';
            if (idxA != idxB) {
                diff += 1;
            }
            array[idxA]++;
            array[idxB]--;
            if (++countArr[idxA] > 1) {
                countGTE2 = true;
            }
        }
        if (diff == 0) {
            return countGTE2;
        }
        if (diff == 1 || diff > 2) {
            return false;
        }
        for (int v : array) {
            if (v != 0) {
                return false;
            }
        }
        return true;
    }
}
