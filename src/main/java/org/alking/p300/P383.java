package org.alking.p300;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class P383 {


    public boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character, Integer> rm = new HashMap<>();
        for (char c : ransomNote.toCharArray()) {
            rm.put(c, rm.getOrDefault(c, 0) + 1);
        }

        HashMap<Character, Integer> mm = new HashMap<>();
        for (char c : magazine.toCharArray()) {
            mm.put(c, mm.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : rm.entrySet()) {
            if (!mm.containsKey(entry.getKey()) || mm.get(entry.getKey()) < entry.getValue()) {
                return false;
            }
        }
        return true;
    }

    public boolean canConstruct2(String ransomNote, String magazine) {
        char[] rArr = ransomNote.toCharArray();
        Arrays.sort(rArr);

        char[] mArr = magazine.toCharArray();
        Arrays.sort(mArr);
        int idx = 0;
        for (char c : rArr) {
            if (idx >= mArr.length) {
                return false;
            }
            while (idx < mArr.length && mArr[idx] != c) {
                idx += 1;
            }
            if (idx >= mArr.length || mArr[idx] != c) {
                return false;
            }
            idx += 1;

        }
        return true;
    }


    public boolean canConstruct3(String ransomNote, String magazine) {
       int[] mArr = new int['z'-'a' +1];
       for(char c:magazine.toCharArray()){
           mArr[c - 'a'] += 1;
       }
       int idx;
       for(char c : ransomNote.toCharArray()){

           idx = c - 'a';
           if((--mArr[idx]) < 0){
               return false;
           }
       }
       return true;

    }

}
