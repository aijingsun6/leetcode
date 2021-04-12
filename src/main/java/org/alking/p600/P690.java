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

    private final HashMap<Integer,Employee> map = new HashMap<>();

    private int acc = 0;

    public int getImportance(List<Employee> employees, int id) {
        map.clear();
        for (Employee e : employees) {
            map.put(e.id, e);
        }
        acc = 0;
        bfs(map.get(id));
        return acc;
    }

    private void bfs(Employee e){
        acc += e.importance;
        for(int sub: e.subordinates){
            Employee e2 = map.get(sub);
            if (e2 != null){
                bfs(e2);
            }
        }
    }

}
