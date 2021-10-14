package org.alking.offerii;

import java.util.Arrays;

/**
 * https://leetcode-cn.com/problems/JFETK5/
 */
class O002 {

    public String addBinary(String a, String b) {

        if ("0".equals(a)) {
            return b;
        }
        if ("0".equals(b)) {
            return a;
        }

        int NA = a.length();
        int NB = b.length();
        char[] arr = new char[Math.max(NA, NB) + 1];
        Arrays.fill(arr, '0');
        int idx = arr.length - 1;
        int idxA = NA - 1;
        int idxB = NB - 1;

        int add = 0;
        while (idxA >= 0 && idxB >= 0) {
            int v = add + a.charAt(idxA--) - '0' + b.charAt(idxB--) - '0';
            switch (v) {
                case 0:
                    arr[idx--] = '0';
                    add = 0;
                    break;
                case 1:
                    arr[idx--] = '1';
                    add = 0;
                    break;
                case 2:
                    arr[idx--] = '0';
                    add = 1;
                    break;
                case 3:
                    arr[idx--] = '1';
                    add = 1;
                    break;
                default:
                    break;
            }
        }

        String c = idxA >= 0 ? a : b;
        int idxC = idxA >= 0 ? idxA : idxB;
        while (idxC >= 0) {
            int v = add + c.charAt(idxC--) - '0';
            switch (v) {
                case 0:
                    arr[idx--] = '0';
                    add = 0;
                    break;
                case 1:
                    arr[idx--] = '1';
                    add = 0;
                    break;
                case 2:
                    arr[idx--] = '0';
                    add = 1;
                    break;
                case 3:
                    arr[idx--] = '1';
                    add = 1;
                    break;
                default:
                    break;
            }
        }
        if (add == 1) {
            arr[idx--] = '1';
        }
        if (arr[0] == '0') {
            return new String(arr, 1, arr.length - 1);
        }
        return new String(arr);
    }
}
