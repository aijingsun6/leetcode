package org.alking.offer;


/**
 * https://leetcode-cn.com/problems/di-yi-ge-zhi-chu-xian-yi-ci-de-zi-fu-lcof/
 */
public class O50 {


    public char firstUniqChar(String s) {

        int[] bucket = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int idx = c - 'a';
            bucket[idx] ++;

        }
        for(int i = 0; i < s.length();i++){
            char c = s.charAt(i);
            int idx = c - 'a';
            if(bucket[idx]==1){
                return c;
            }
        }

        return ' ';
    }
}
