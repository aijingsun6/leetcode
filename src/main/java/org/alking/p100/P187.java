package org.alking.p100;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class P187 {

    /**
     * A,C,G,T 4进制
     */
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> res = new ArrayList<>();
        final int N = s.length();
        if (N < 11) {
            return res;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        int hash = 0;
        for (int i = 0; i < 10; i++) {
            char c = s.charAt(i);
            hash = (hash << 2) + code(c);
        }
        map.put(hash, 1);
        for (int i = 10; i < N; i++) {
            char c = s.charAt(i);
            hash = (hash << 2) + code(c);

            char pre = s.charAt(i - 10);
            hash = hash - (code(pre) << 20);

            if(map.containsKey(hash)){
                int cnt = map.get(hash);
                if(cnt == 1){
                    String sub = s.substring(i-9,i+1);
                    res.add(sub);
                    map.put(hash,2);
                }
            }else{
                map.put(hash,1);
            }
        }
        return res;
    }

    private int code(char c) {
        switch (c) {
            case 'A':
                return 0;
            case 'C':
                return 1;
            case 'G':
                return 2;
            case 'T':
                return 3;
            default:
                return 0;
        }
    }
}
