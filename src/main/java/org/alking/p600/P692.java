package org.alking.p600;

import java.util.*;

public class P692 {

    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> cntMap = new HashMap<>();
        Arrays.asList(words).forEach(x -> cntMap.put(x, cntMap.getOrDefault(x, 0) + 1));
        PriorityQueue<Map.Entry<String, Integer>> q = new PriorityQueue<>((o1, o2) -> {
            if (!o1.getValue().equals(o2.getValue())) {
                return o1.getValue() - o2.getValue();
            }
            return o2.getKey().compareTo(o1.getKey());
        });
        cntMap.entrySet().forEach(e -> {
            q.offer(e);
            if(q.size() > k){
                q.poll();
            }

        });
        List<String> ret = new ArrayList<String>();
        while (!q.isEmpty()) {
            ret.add(q.poll().getKey());
        }
        Collections.reverse(ret);
        return ret;
    }

}
