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
        if (idx > 0 && arr[idx - 1] == '-') {
            length = idx - 1;
        }
        String s = new String(arr, 0, length);
        return new StringBuffer(s).reverse().toString().toUpperCase();
    }

    public String licenseKeyFormatting2(String s, int k) {

        int idx = 0;
        StringBuilder sb = new StringBuilder();
        final int N = s.length();
        for (int i = N - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c != '-') {
                sb.append(Character.toUpperCase(c));
                idx++;
                if (idx % k == 0) {
                    sb.append('-');
                }
            }
        }
        String r = sb.reverse().toString();
        if(r.length() < 1){
            return "";
        }
        if(r.charAt(0) == '-'){
            return r.substring(1);
        }
        return r;
    }
}
