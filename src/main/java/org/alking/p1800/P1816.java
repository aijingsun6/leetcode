package org.alking.p1800;

import java.util.ArrayList;

/**
 * https://leetcode-cn.com/problems/truncate-sentence/
 */
public class P1816 {

    public String truncateSentence(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int start = -1;
        int count = 0;
        char[] array = s.toCharArray();
        for (int i = 0; i < array.length; i++) {
            char c = array[i];
            if (c == ' ') {
                if (start != -1) {
                    String add = new String(array, start, i - start);
                    if(count == 0){
                        sb.append(add);
                    }else{
                        sb.append(" ").append(add);
                    }
                    count ++;
                    start = -1;
                }
            } else if (start == -1) {
                start = i;
            }
            if (count == k) {
                return sb.toString();
            }
        }
        if (start != -1) {
            String add = new String(array, start, array.length-start);
            if(count == 0){
                sb.append(add);
            }else{
                sb.append(" ").append(add);
            }
        }
        return sb.toString();
    }
}
