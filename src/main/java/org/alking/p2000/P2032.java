package org.alking.p2000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P2032 {

    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        int[] bucket = new int[101];
        for(int v: nums1){
            bucket[v] = bucket[v]|1;
        }
        for(int v: nums2){
            bucket[v] = bucket[v]|2;
        }
        for(int v: nums3){
            bucket[v] = bucket[v]|4;
        }
        ArrayList<Integer> acc = new ArrayList<>();
        for (int i = 0; i < 101;i ++) {
            int v = bucket[i];
            if(v == 3 || v == 5 || v == 6 || v == 7){
                acc.add(i);
            }
        }
        return acc;
    }

    public List<Integer> twoOutOfThree2(int[] nums1, int[] nums2, int[] nums3) {
        HashMap<Integer, Integer> exist = new HashMap<>();
        for (int v : nums1) {
            exist.put(v, 1);
        }
        for (int v : nums2) {
            exist.put(v, exist.getOrDefault(v, 0) | 2);
        }
        for (int v : nums3) {
            exist.put(v, exist.getOrDefault(v, 0) | 4);
        }
        ArrayList<Integer> acc = new ArrayList<>();
        for (Map.Entry<Integer, Integer> e : exist.entrySet()) {
            if (Integer.bitCount(e.getValue()) > 1) {
                acc.add(e.getKey());
            }
        }
        return acc;
    }
}
