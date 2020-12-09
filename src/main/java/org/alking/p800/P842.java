package org.alking.p800;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P842 {

    public List<Integer> splitIntoFibonacci(String s) {
        ArrayList<Integer> acc = new ArrayList<>();
        if (dfs(s, 0, acc)) {
            return acc;
        }
        return Collections.emptyList();
    }

    private boolean dfs(String s, int from, ArrayList<Integer> acc) {
        if (from == s.length()) {
            return true;
        }
        int size = acc.size();
        if (size < 2) {
            // size = 0 or size = 1
            for (int to = from + 1; to < s.length(); to++) {
                String fs = s.substring(from, to);
                if(fs.startsWith("0") && !fs.equals("0")){
                    continue;
                }
                try{
                    Integer fi = Integer.valueOf(fs);
                    acc.add(fi);
                    if (dfs(s, to, acc)) {
                        return true;
                    }
                    acc.remove(size);
                }catch (Exception e){
                    break;
                }

            }
            return false;
        }
        // size >= 2
        int expect = acc.get(size - 1) + acc.get(size - 2);
        String es = String.valueOf(expect);
        int to = from + es.length();
        if (to > s.length()) {
            return false;
        }
        if (!s.substring(from, to).equals(es)) {
            return false;
        }
        acc.add(expect);
        if (dfs(s, to, acc)) {
            return true;
        }
        acc.remove(size);
        return false;
    }
}
