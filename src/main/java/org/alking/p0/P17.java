package org.alking.p0;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P17 {

    private static Map<Character,List<Character>> map = new HashMap<>();

    static {
        map.put('2', Arrays.asList('a','b','c'));
        map.put('3', Arrays.asList('d','e','f'));
        map.put('4', Arrays.asList('g','h','i'));
        map.put('5', Arrays.asList('j','k','l'));
        map.put('6', Arrays.asList('m','n','o'));
        map.put('7', Arrays.asList('p','q','r','s'));
        map.put('8', Arrays.asList('t','u','v'));
        map.put('9', Arrays.asList('w','x','y','z'));
    }


    public List<String> letterCombinations(String digits) {

        return null;
    }


}
