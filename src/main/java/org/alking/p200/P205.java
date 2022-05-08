package org.alking.p200;

import java.util.Arrays;

public class P205 {


    public boolean isIsomorphic(String s, String t) {

        if (s == null || t == null) {
            return false;
        }
        if (s.length() != t.length()) {
            return false;
        }
        int size = 256;
        int[] sarr = new int[size];
        int[] tarr = new int[size];
        Arrays.fill(sarr,-1);
        Arrays.fill(tarr,-1);
        for (int i = 0; i < s.length(); i++) {

            int idxS = s.charAt(i);
            int idxT = t.charAt(i);


            int x = sarr[idxS];
            int y = tarr[idxT];

            if (x != y) {
                return false;
            }

            sarr[idxS] = i;
            tarr[idxT] = i;
        }
        return true;

    }

}
