package org.alking.p1500;

public class P1528 {

    public String restoreString(String s, int[] indices) {

        char[] arr = new char[s.length()];
        int N = s.length();
        for (int i = 0; i < s.length(); i++) {
            arr[indices[i]] = s.charAt(i);
        }
        return new String(arr, 0, N);
    }
}
