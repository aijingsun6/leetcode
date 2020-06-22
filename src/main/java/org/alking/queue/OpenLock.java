package org.alking.queue;

import java.util.*;

public class OpenLock {

    private List<String> nearBy(String s) {
        char[] cs = s.toCharArray();
        List<String> acc = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            StringBuilder sb1 = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            for (int j = 0; j < 4; j++) {
                if (j == i) {
                    sb1.append((char) ('0' + (cs[j] + 1 - '0') % 10));
                    sb2.append((char) ('0' + (cs[j] - 1 - '0' + 10) % 10));
                } else {
                    sb1.append(cs[j]);
                    sb2.append(cs[j]);
                }

            }
            acc.add(sb1.toString());
            acc.add(sb2.toString());
        }
        return acc;

    }

    public int openLock(String[] deadends, String target) {
        String origin = "0000";
        if(origin.equals(target)){
            return 0;
        }
        Set<String> deads=new HashSet<>(Arrays.asList(deadends));
        if(deads.contains(origin)){
            return -1;
        }

        Map<Integer,List<String>> map = new HashMap<>();
        Set<String> visit = new HashSet<>();
        visit.add(origin);
        map.put(0,Arrays.asList(origin));
        int level = 0;
        while (true){
            List<String> last = map.get(level);
            level = level + 1;
            List<String> acc = new ArrayList<>();
            for(String s: last){
                List<String> nears = nearBy(s);
                for(String n: nears){
                    if(n.equals(target)){
                        return level;
                    }
                    if(!deads.contains(n) && !visit.contains(n)){
                        acc.add(n);
                        visit.add(n);
                    }
                }
            }
            if(acc.isEmpty()){
                return -1;
            }else {
                map.put(level,acc);
            }
        }
    }
}
