package org.alking.p300;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

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

        return null;

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

    private Optional<Double> findValue(HashMap<String, HashMap<String, Double>> map, String a, String b, double acc) {

        if(!map.containsKey(a)){
            return Optional.empty();
        }
        HashMap<String,Double> m  = map.get(a);
        return null;



    }





}
