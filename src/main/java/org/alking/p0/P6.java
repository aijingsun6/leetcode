package org.alking.p0;

public class P6 {

    public String convert(String s, int numRows) {

        if(numRows < 2){
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
