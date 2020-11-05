package org.alking.p800;

import java.util.*;

public class P811 {

    public List<String> subdomainVisits(String[] cpdomains) {
        HashMap<String, Integer> cntMap = new HashMap<>();
        for (String s : cpdomains) {
            String[] cntArr = s.split(" ",2);
            Integer add = Integer.valueOf(cntArr[0]);
            s = cntArr[1];
            while (true){
                cntMap.put(s,cntMap.getOrDefault(s,0)+add);
                String[] arr = s.split("\\.",2);
                if(arr.length == 2){
                    s = arr[1];
                }else {
                    break;
                }
            }
        }
        ArrayList<String> acc = new ArrayList<>();
        for(Map.Entry<String,Integer> entry: cntMap.entrySet()){
            acc.add(String.format("%d %s",entry.getValue(),entry.getKey()));
        }
        return acc;
    }
}
