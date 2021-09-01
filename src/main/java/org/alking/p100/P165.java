package org.alking.p100;

import java.util.ArrayList;

public class P165 {

    public int compareVersion(String version1, String version2) {
        ArrayList<Integer> v1 = parseV(version1);
        ArrayList<Integer> v2 = parseV(version2);
        int min = Math.min(v1.size(), v2.size());
        for (int i = 0; i < min; i++) {
            int c = v1.get(i).compareTo(v2.get(i));
            if (c != 0) {
                return c;
            }
        }


        if (v1.size() < v2.size()) {
            for(int i  = min; i < v2.size(); i++){
                if (v2.get(i) > 0){
                    return -1;
                }
            }
            return 0;
        } else if (v1.size() > v2.size()) {
            for(int i  = min; i < v1.size(); i++){
                if (v1.get(i) > 0){
                    return 1;
                }
            }
            return 0;
        }else{
            return 0;
        }
    }

    private ArrayList<Integer> parseV(String v) {
        ArrayList<Integer> result = new ArrayList<>();
        int acc = 0;
        for (int i = 0; i < v.length(); i++) {
            char c = v.charAt(i);
            if (c == '.') {
                result.add(acc);
                acc = 0;
                continue;
            }
            if (c == '0' && acc == 0) {
                continue;
            }
            acc = acc * 10 + c - '0';
        }
        if (acc != 0) {
            result.add(acc);
        }
        return result;
    }
}
