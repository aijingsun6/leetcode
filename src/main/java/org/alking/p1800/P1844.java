package org.alking.p1800;

/**
 * https://leetcode-cn.com/problems/replace-all-digits-with-characters/
 */
public class P1844 {


    private char shift(char c,char offset){
        return (char)(c + offset - '0');
    }
    public String replaceDigits(String s) {

        char[] array = s.toCharArray();
        for (int i = 1; i < s.length(); i += 2) {

            array[i] = shift(array[i-1],array[i]);

        }

        return new String(array);
    }
}
