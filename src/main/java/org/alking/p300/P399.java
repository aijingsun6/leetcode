package org.alking.p300;

import java.util.*;

public class P399 {

    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        HashMap<String, HashMap<String, Double>> map = new HashMap<>();
        int size = values.length;
        for (int i = 0; i < size; i++) {
            List<String> eq = equations.get(i);
            String a = eq.get(0);
            String b = eq.get(1);
            double v = values[i];
            putPair(map, a, b, v);
            putPair(map, b, a, 1 / v);
        }
        double[] result = new double[queries.size()];
        for (int i = 0; i < queries.size(); i++) {
            List<String> q = queries.get(i);
            Double opt = findValue(map, q.get(0), q.get(1), 1.0d,new HashSet<>());
            result[i] =  opt == null ? -1d: opt;
        }
        return result;
    }


    private void putPair(HashMap<String, HashMap<String, Double>> map, String a, String b, Double v) {
        HashMap<String, Double> m = null;
        if (map.containsKey(a)) {
            m = map.get(a);
        } else {
            m = new HashMap<>();
            map.put(a, m);
        }
        m.put(b, v);
    }

    private Double findValue(HashMap<String, HashMap<String, Double>> map, String a, String b, double acc, Set<String> visit) {
        if (!map.containsKey(a)) {
            return null;
        }
        if(a.equals(b)){
            return 1d * acc;
        }
        HashMap<String, Double> m = map.get(a);
        if (m.containsKey(b)) {
            return acc * m.get(b);
        }
        visit.add(a);
        for (Map.Entry<String, Double> entry : m.entrySet()) {
            String k = entry.getKey();
            if(visit.contains(k)){
                continue;
            }
            visit.add(k);
            Double opt = findValue(map, entry.getKey(), b, acc * entry.getValue(),visit);
            if (opt != null) {
                return opt;
            }
            visit.remove(k);
        }
        return null;
    }
}
