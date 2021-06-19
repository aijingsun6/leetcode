package org.alking.p1200;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P1239 {

    private final int SIZE = 'z' + 1;

    private final boolean[] cache = new boolean[SIZE];

    private int max = 0;

    public int maxLength(List<String> arr) {
        Arrays.fill(cache, false);
        this.max = 0;
        backtrace(arr, 0, arr.size() - 1, 0,new ArrayList<>());
        return this.max;
    }

    private boolean check(String s) {
        if(!checkSelf(s)){
            return false;
        }
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (cache[s.charAt(i)]) {
                return false;
            }
        }
        return true;
    }

    private boolean checkSelf(String s){
        boolean[] tmp = new boolean['z'-'a'+1];
        int n = s.length();
        for (int i = 0; i < n; i++) {
            int idx = s.charAt(i)-'a';
            if (tmp[idx]) {
                return false;
            }
            tmp[idx] = true;
        }
        return true;
    }

    private void setValue(String s, boolean value) {
        int n = s.length();
        for (int i = 0; i < n; i++) {
            cache[s.charAt(i)] = value;
        }
    }

    private void backtrace(List<String> arr, final int from, final int to, final int acc, final ArrayList<String> accString) {
        if (from > to) {
            return;
        }
        final String s = arr.get(from);
        boolean check = this.check(s);
        if (check) {
            int acc2 = acc + s.length();
            setValue(s, true);
            //accString.add(s);
            this.max = Math.max(this.max, acc2);
            // System.out.println(String.format("%s,%d,%s",s,acc2,accString));
            backtrace(arr, from + 1, to, acc2,accString);
            setValue(s, false);
            // accString.remove(accString.size()-1);
        }
        backtrace(arr, from + 1, to, acc,accString);
    }
}
