package org.alking.p0;

public class P6 {

    public String convert2(String s, int numRows) {

        if(numRows < 2){
            return s;
        }
        StringBuilder sb = new StringBuilder();
        final int gap = numRows * 2 - 2;
        final int N = s.length();
        for (int r = 0; r < numRows; r++) {
            if (r == 0 || r == numRows - 1) {
                int start = r;
                while (start < N) {
                    sb.append(s.charAt(start));
                    start += gap;
                }
            } else {
                int s1 = r;
                int s2 = gap - r;
                while (s1 < N || s2 < N){
                    if(s1 < N){
                        sb.append(s.charAt(s1));
                    }
                    if(s2 < N){
                        sb.append(s.charAt(s2));
                    }
                    s1 += gap;
                    s2 += gap;
                }
            }
        }
        return sb.toString();
    }

    public String convert(String s, int numRows) {

        if (numRows < 2) {
            return s;
        }

        StringBuilder[] arr = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            arr[i] = new StringBuilder();
        }

        int idx = 0;
        boolean down = true;
        for (char c : s.toCharArray()) {
            arr[idx].append(c);
            if (idx == 0) {
                idx += 1;
                down = true;
            } else if (idx == numRows - 1) {
                idx -= 1;
                down = false;
            } else if (down) {
                idx += 1;
            } else {
                idx -= 1;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            sb.append(arr[i]);
        }
        return sb.toString();
    }
}
