package org.alking.p500;

import java.util.Arrays;

public class P500 {

    private static int[] cache = new int['z'+1];

    static {
        char[] l1 = "qwertyuiopQWERTYUIOP".toCharArray();
        char[] l2 = "asdfghjklASDFGHJKL".toCharArray();
        char[] l3 = "zxcvbnmZXCVBNM".toCharArray();
        for(char c: l1){
            cache[c] = 1;
        }
        for(char c: l2){
            cache[c] = 2;
        }
        for(char c: l3){
            cache[c] = 3;
        }

    }

    public String[] findWords(String[] words) {
        String[] tmp = new String[words.length];
        int idx = 0;
        for(String s: words){
            if(s == null || s.isEmpty()){
                continue;
            }
            int line = cache[s.charAt(0)];
            boolean insert = true;
            for(int i =0;i < s.length();i++){
                if(cache[s.charAt(i)] != line){
                    insert = false;
                    break;
                }
            }
            if(insert){
                tmp[idx++] = s;
            }
        }
        tmp = Arrays.copyOf(tmp,idx);
        return tmp;
    }
}
