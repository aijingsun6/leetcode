package org.alking.p300;

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
}
