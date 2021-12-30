package org.alking.p1000;

import java.util.ArrayList;
import java.util.HashMap;

public class P1044 {

    public String longestDupSubstring(String s) {
        HashMap<Integer, ArrayList<String>> map = new HashMap<>();
        String result = "";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            int hash = 0;
            for (int j = i; j < s.length(); j++) {
                hash = 31 * hash + s.charAt(j);
                int c = j - i + 1;
                String sub = s.substring(i, j + 1);
                ArrayList<String> set = map.get(hash);
                if (set == null){
                    set = new ArrayList<>();
                    set.add(sub);
                    map.put(hash, set);
                    continue;
                }
                if(!set.contains(sub)){
                    set.add(sub);
                    continue;
                }
                if(c > count){
                    result = sub;
                    count = c;
                }
            }
        }
        return result;
    }
}
