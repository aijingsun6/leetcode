package org.alking.p300;

import java.util.*;

/**
 * https://leetcode-cn.com/problems/reconstruct-itinerary/
 */
public class P332 {

    public List<String> findItinerary(List<List<String>> tickets) {
        TreeMap<String, TreeMap<String, Integer>> map = new TreeMap<>();
        String k1;
        String k2;
        TreeMap<String, Integer> tmp;
        for (List<String> entry : tickets) {
            k1 = entry.get(0);
            k2 = entry.get(1);
            tmp = map.getOrDefault(k1, new TreeMap<>());
            int c = tmp.getOrDefault(k2, 0);
            tmp.put(k2, c + 1);
            map.put(k1, tmp);
        }
        List<String> acc = new ArrayList<>();
        HashMap<String, Integer> visit = new HashMap<>();
        String start = "JFK";
        dfs(start, map, visit, tickets.size() + 1, 0, acc);
        return acc;
    }

    private boolean dfs(String k, TreeMap<String, TreeMap<String, Integer>> map, HashMap<String, Integer> visit, int total, int num, List<String> acc) {
        acc.add(k);
        num = num + 1;
        if (num == total) {
            return true;
        }
        if (!map.containsKey(k)) {
            acc.remove(acc.size() - 1);
            return false;
        }
        for (Map.Entry<String, Integer> entry : map.get(k).entrySet()) {
            String to = entry.getKey();
            String s = String.format("%s-%s", k, to);
            int c = visit.getOrDefault(s, 0);
            if (c < entry.getValue()) {
                visit.put(s, c + 1);
                if (dfs(entry.getKey(), map, visit, total, num, acc)) {
                    return true;
                } else {
                    visit.put(s, c);
                }
            }
        }
        acc.remove(acc.size() - 1);
        return false;
    }


}
