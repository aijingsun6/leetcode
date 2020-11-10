package org.alking.p800;

import java.util.ArrayList;

public class P821 {

    public int[] shortestToChar(String S, char C) {
        ArrayList<Integer> hitArr = new ArrayList<>();
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == C) {
                hitArr.add(i);
            }
        }
        int[] res = new int[S.length()];
        for (int i = 0; i < S.length(); i++) {
            res[i] = dist(S, i, hitArr, C);
        }
        return res;
    }

    private int dist(String s, int i, ArrayList<Integer> hitArr, char C) {
        char c = s.charAt(i);
        if (c == C) {
            return 0;
        }
        int min = s.length();
        for (int hit : hitArr) {

            int v = Math.abs(i - hit);
            if (v < min) {
                min = v;
            }
            if(hit > i){
                return min;
            }
        }
        return min;
    }

}
