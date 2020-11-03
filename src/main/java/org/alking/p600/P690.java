package org.alking.p600;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.List;

public class P690 {

    public static class Employee {
        public int id;
        public int importance;
        public List<Integer> subordinates;
    }

    public int getImportance(List<Employee> employees, int id) {
        HashMap<Integer, Employee> map = new HashMap<>();
        for (Employee e : employees) {
            map.put(e.id, e);
        }
        int sum = 0;
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.addLast(id);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Integer first = queue.removeFirst();
                Employee e = map.get(first);
                if (e != null) {
                    sum += e.importance;
                    queue.addAll(e.subordinates);
                }
            }
        }
        return sum;

    }


}
