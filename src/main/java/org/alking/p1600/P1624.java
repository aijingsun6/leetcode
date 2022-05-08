package org.alking.p1600;

import java.util.ArrayList;
import java.util.Arrays;

public class P1624 {

    public int maxLengthBetweenEqualCharacters(String s) {

        ArrayList<Integer>[] bucket = new ArrayList[26];
        for (int i = 0; i < bucket.length; i++) {
            bucket[i] = new ArrayList<>();
        }

        for (int i = 0; i < s.length(); i++) {
            bucket[s.charAt(i) - 'a'].add(i);
        }
        int max = -1;
        for (int i = 0; i < bucket.length; i++) {
            int size = bucket[i].size();
            if (size > 1) {
                max = Math.max(max, bucket[i].get(size - 1) - bucket[i].get(0) - 1);
            }
        }
        return max;
    }

    public int maxLengthBetweenEqualCharacters2(String s) {

        int[] start = new int[26];
        int[] end = new int[26];
        Arrays.fill(start, -1);
        Arrays.fill(end, -1);
        int max = -1;
        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) - 'a';
            if(start[idx]==-1){
                start[idx] = i;
            }else{
                end[idx] = i;
                max = Math.max(max,end[idx]-start[idx]-1);
            }
        }
        return max;
    }
}
