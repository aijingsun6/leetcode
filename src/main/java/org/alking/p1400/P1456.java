package org.alking.p1400;

public class P1456 {

    public int maxVowels(String s, int k) {
        final int N = s.length();
        int[] map = new int[26];
        for(char c: "aeiou".toCharArray()){
            map[c-'a'] = 1;
        }
        int sum = 0;
        for(int i = 0; i < Math.min(k,N);i++){
            sum += map[s.charAt(i)-'a'];
        }
        int max = sum;

        for(int i = k ; i < N; i++){
            sum += map[s.charAt(i)-'a'];
            sum -= map[s.charAt(i-k)-'a'];
            max = Math.max(max,sum);
        }
        return max;
    }

}
