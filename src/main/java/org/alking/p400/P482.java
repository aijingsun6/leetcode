package org.alking.p400;

public class P482 {

    public String licenseKeyFormatting(String S, int K) {
        int size = S.length();
        char[] arr = new char[size * 2];
        int idx = 0;
        int count = 0;
        for (int i = size - 1; i >= 0; i--) {
            char c = S.charAt(i);
            if (c != '-') {
                arr[idx++] = c;
                count++;
                if (count == K) {
                    arr[idx++] = '-';
                    count = 0;
                }
            }

        }
        int length = idx;
        if (idx > 0 && arr[idx-1] == '-') {
            length = idx - 1;
        }
        String s = new String(arr, 0, length);
        return new StringBuffer(s).reverse().toString().toUpperCase();
    }
}
