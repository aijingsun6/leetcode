package org.alking.p500;

public class P541 {

    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        int end;
        for (int idx = 0; idx < s.length(); idx += (k * 2)) {
            end = Math.min(idx + k - 1, s.length() - 1);
            reverse(arr, idx, end);
        }
        return new String(arr);
    }

    private void reverse(char[] arr, int start, int end) {
        char c;
        while (start < end) {
            c = arr[start];
            arr[start] = arr[end];
            arr[end] = c;
            start += 1;
            end -= 1;
        }
    }
}
