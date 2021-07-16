package org.alking.mian;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class M1002 {


    private static final int[] PRIMES = new int[]{
            2, 3, 5, 7, 11,
            13, 17, 19, 23, 29,
            31, 37, 41, 43, 47,
            53, 59, 61, 67, 71,
            73, 79, 83, 89, 97,
            101, 103, 107, 109, 113,
            127, 131, 137, 139, 149,
            151, 157, 163, 167, 173,
            179, 181, 191, 193, 197, 199,
            211, 223, 227, 229, 233, 239, 241, 251, 257, 263, 269
    };


    public List<List<String>> groupAnagrams(String[] strs) {
        Map<BigDecimal, List<String>> map = new HashMap<>();
        for (String str : strs) {
            BigDecimal key = getKey(str);
            List<String> list = map.getOrDefault(key, new ArrayList<>());
            list.add(str);
            map.put(key, list);
        }
        return new ArrayList<>(map.values());
    }

    public BigDecimal getKey(String s) {
        BigDecimal acc = new BigDecimal(1);
        for (int i = 0; i < s.length(); i++) {
            acc = acc.multiply(new BigDecimal(PRIMES[s.charAt(i) - 'a']));
        }
        return acc;
    }
}
