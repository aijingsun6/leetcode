package org.alking.p200;

/**
 * https://leetcode-cn.com/problems/shortest-palindrome/
 */
public class P214 {

//    public String shortestPalindrome(String s) {
//        int n = s.length();
//        int[] fail = new int[n];
//        Arrays.fill(fail, -1);
//        for (int i = 1; i < n; ++i) {
//            int j = fail[i - 1];
//            while (j != -1 && s.charAt(j + 1) != s.charAt(i)) {
//                j = fail[j];
//            }
//            if (s.charAt(j + 1) == s.charAt(i)) {
//                fail[i] = j + 1;
//            }
//        }
//        int best = -1;
//        for (int i = n - 1; i >= 0; --i) {
//            while (best != -1 && s.charAt(best + 1) != s.charAt(i)) {
//                best = fail[best];
//            }
//            if (s.charAt(best + 1) == s.charAt(i)) {
//                ++best;
//            }
//        }
//        String add = (best == n - 1 ? "" : s.substring(best + 1));
//        StringBuffer ans = new StringBuffer(add).reverse();
//        ans.append(s);
//        return ans.toString();
//    }


    public String shortestPalindrome(String s) {

        if (s == null || s.length() < 2) {
            return s;
        }
        char[] arr = s.toCharArray();
        if (checkArray(arr, 0, arr.length - 1)) {
            return s;
        }

        char[] acc = new char[s.length() * 2];
        int idxEnd;
        for (int i = 0; i < arr.length; i++) {
            idxEnd = arr.length - 1;
            for (int idx = 0; idx <= i; idx++) {
                acc[idx] = arr[idxEnd];
                idxEnd--;
            }

            System.arraycopy( arr,0, acc, i + 1,arr.length);
            if(checkArray(acc,0, i + arr.length)){
                return new String(acc,0,i + arr.length + 1);
            }

        }
        return s;
    }

    private boolean checkArray(char[] arr, int start, int end) {
        while (start < end) {
            if (arr[start] != arr[end]) {
                return false;
            }
            start += 1;
            end -= 1;
        }
        return true;

    }

}
