package org.alking.p1400;

import java.util.HashSet;

public class P1461 {


    public boolean hasAllCodes(String s, int k) {
        HashSet<Integer> set = new HashSet<>();
        int r = s.length() - k + 1;
        if (r < (1 << k)) {
            return false;
        }
        int num = 0;
        for (int i = 0; i < k; i++) {
            num = num << 1 ;
            num += (s.charAt(i) - '0');
        }
        set.add(num);
        for (int i = k; i < s.length(); i++) {
            num -= (s.charAt(i-k)-'0') << (k-1);
            num = num << 1 ;
            num += (s.charAt(i)-'0');
            set.add(num);
        }

        return set.size() ==  (1 << k);
    }


}
