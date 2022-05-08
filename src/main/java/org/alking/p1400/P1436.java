package org.alking.p1400;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class P1436 {

    public String destCity(List<List<String>> paths) {
        HashSet<String> output = new HashSet<>();
        HashSet<String> input = new HashSet<>();
        for (List<String> e : paths) {
            output.add(e.get(0));
            input.add(e.get(1));
        }
        for (String s : input) {
            if (!output.contains(s)) {
                return s;
            }
        }
        return "";
    }

    public String destCity2(List<List<String>> paths) {
        HashMap<String, String> map = new HashMap<>();
        paths.stream().forEach(x -> map.put(x.get(0), x.get(1)));
        for (Map.Entry<String, String> e : map.entrySet()) {
            if (!map.containsKey(e.getValue())) {
                return e.getValue();
            }
        }
        return "";
    }
}
