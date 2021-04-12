package org.alking.p0;

public class P91 {

    private static boolean single(char[] arr, int idx) {
        return  arr[idx] != '0';
    }

    private static boolean withPrev(char[] arr, int idx){

        if(arr[idx-1] == '0'){
            return false;
        }
        if(arr[idx-1] > '2'){
            return false;
        }
        if(arr[idx-1] == '2' && arr[idx] > '6'){
            return false;
        }
        return true;

    }

    public int numDecodings(String s) {
        int size = s.length();
        int[] dp = new int[size+1];
        char[] arr = s.toCharArray();
        dp[0] = arr[0] == '0' ? 0:1;
        dp[1] = dp[0];
        for (int i = 1; i < size; i++) {
            int j = i + 1;
            if(single(arr,i)){
                dp[j] += dp[j-1];
            }
            if(withPrev(arr,i)){
                dp[j] += dp[j-2];
            }
        }
        return dp[size];
    }
}
