package org.alking.p400;

import java.util.ArrayDeque;
import java.util.HashSet;

public class P433 {

    public int minMutation(String start, String end, String[] bank) {
        if (start.equals(end)) {
            return 0;
        }
        if (bank == null || bank.length == 0) {
            return -1;
        }
        HashSet<Integer> bankSet = new HashSet<>();
        for (String s : bank) {
            bankSet.add(hash(s));
        }
        if (!bankSet.contains(hash(end))) {
            return -1;
        }

        int dist = 0;
        ArrayDeque<String> q = new ArrayDeque<>();
        HashSet<Integer> visit = new HashSet<>();
        q.add(start);
        visit.add(hash(start));

        while (!q.isEmpty()) {
            final int size = q.size();
            for (int i = 0; i < size; i++) {
                String ori = q.removeFirst();
                if (ori.equals(end)) {
                    return dist;
                }
                char[] arr = ori.toCharArray();
                int hash = hash(arr);
                for (int j = 0; j < 8; j++) {
                    char old = arr[j];
                    for (char c : "ACGT".toCharArray()) {
                        if (c != old) {
                            arr[j] = c;
                            String s = new String(arr);
                            int shift = j << 1;
                            int code = hash - (charValue(old) << shift) + (charValue(c) << shift);
                            if (bankSet.contains(code) && !visit.contains(code)) {
                                q.add(s);
                                visit.add(code);
                            }
                        }
                    }
                    arr[j] = old;
                }
            }
            dist++;
        }
        return -1;
    }

    private int charValue(char c) {
        int v = 0;
        switch (c) {
            case 'A':
                v = 0;
                break;
            case 'C':
                v = 1;
                break;
            case 'G':
                v = 2;
                break;
            case 'T':
                v = 3;
                break;
        }
        return v;
    }

    private int hash(char[] cs) {
        int hash = 0;
        for(int i = 0; i < 8; i ++){
            hash |= (charValue(cs[i]) << (i<<1));
        }
        return hash;
    }

    private int hash(String s) {
        return hash(s.toCharArray());
    }

}
