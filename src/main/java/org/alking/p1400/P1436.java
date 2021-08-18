package org.alking.p1400;

import java.util.HashSet;
import java.util.List;

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
}
