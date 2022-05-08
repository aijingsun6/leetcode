package org.alking.p1400;

import java.util.*;

public class P1418 {

    private String[] foodNameArray(HashSet<String> set) {
        String[] result = new String[set.size()];
        int idx = 0;
        for (String s : set) {
            result[idx++] = s;
        }
        Arrays.sort(result);
        return result;
    }


    public List<List<String>> displayTable(List<List<String>> orders) {
        final int MAX = 500;
        HashSet<String> foodName = new HashSet<>();
        HashMap<String, Integer>[] tables = new HashMap[1 + MAX];
        for (List<String> order : orders) {
            Integer table = Integer.valueOf(order.get(1));
            String food = order.get(2);
            foodName.add(food);
            if (tables[table] == null) {
                tables[table] = new HashMap<>();
            }
            HashMap<String, Integer> m = tables[table];
            m.put(food, m.getOrDefault(food, 0) + 1);
        }

        List<List<String>> acc = new ArrayList<>();
        String[] foodArr = foodNameArray(foodName);
        List<String> header = new ArrayList<>();
        header.add("Table");
        for (String food : foodArr) {
            header.add(food);
        }
        acc.add(header);
        for (int i = 1; i <= MAX; i++) {
            if (tables[i] != null) {
                List<String> line = new ArrayList<>();
                line.add(String.valueOf(i));
                for (String s : foodArr) {
                    line.add(String.valueOf(tables[i].getOrDefault(s, 0)));
                }
                acc.add(line);
            }
        }
        return acc;
    }
}
