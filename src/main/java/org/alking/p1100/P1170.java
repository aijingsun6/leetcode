package org.alking.p1100;

import java.util.*;

public class P1170 {


    public int[] numSmallerByFrequency(String[] queries, String[] words) {

        int[] cntArr = new int[queries.length];
        Set<Integer> cntSet = new HashSet<>();
        for (int i = 0; i < queries.length; i++) {
            int c = calcF(queries[i]);
            cntArr[i] = c;
            cntSet.add(c);
        }

        HashMap<Integer, Integer> cache = calcCache(cntSet, words);
        int[] result = new int[queries.length];
        for (int i = 0; i < cntArr.length; i++) {
            result[i] = cache.getOrDefault(cntArr[i], 0);
        }
        return result;
    }

    private HashMap<Integer, Integer> calcCache(Set<Integer> set, String[] words) {
        // sort key
        int[] arr = new int[set.size()];
        int idx = 0;
        for (int v : set) {
            arr[idx] = v;
            idx += 1;
        }
        Arrays.sort(arr);


        // sort count
        TreeMap<Integer, Integer> wordsMap = buildMap(words);
        Map.Entry<Integer, Integer>[] entryArray = new Map.Entry[wordsMap.size()];
        idx = 0;
        for (Map.Entry<Integer, Integer> entry : wordsMap.entrySet()) {
            entryArray[idx] = entry;
            idx += 1;
        }

        //

        HashMap<Integer, Integer> result = new HashMap<>();


        int total = words.length;
        int sum = 0;
        int aIdx = 0;
        int bIdx = 0;

        while (aIdx < arr.length && bIdx < entryArray.length) {

            if (entryArray[bIdx].getKey() <= arr[aIdx]) {
                sum += entryArray[bIdx].getValue();
                bIdx += 1;
                continue;
            }
            result.put(arr[aIdx], total - sum);
            aIdx += 1;


        }


        return result;
    }

    private TreeMap<Integer, Integer> buildMap(String[] words) {

        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (String s : words) {
            int cnt = calcF(s);
            map.put(cnt, map.getOrDefault(cnt, 0) + 1);
        }
        return map;
    }


    private int calcF(String s) {

        int[] arr = new int['z' - 'a' + 1];

        for (char c : s.toCharArray()) {
            arr[c - 'a'] += 1;
        }

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 0) {
                return arr[i];
            }
        }
        return 0;

    }

}
