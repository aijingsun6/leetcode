package org.alking.p0;

public class P58 {
    public int lengthOfLastWord(String s) {
        int N = s.length();
        int start = N - 1;
        while (s.charAt(start) == ' ') {
            start--;
        }
        int end = start;
        while (end >= 0 && s.charAt(end) != ' ') {
            end--;
        }
        return start - end;
    }
}
