package org.alking.p0;

import java.util.ArrayList;
import java.util.List;

public class P93 {

    public List<String> restoreIpAddresses(String s) {

        acc.clear();
        pre = -1;
        result.clear();
        dfs(s.toCharArray(), 0);
        return result;
    }

    private void dfs(char[] array, int from) {

        if (from >= array.length) {
            if (acc.size() == 4) {
                result.add(String.join(".", acc));
            }
            return;
        }
        if (acc.size() > 4) {
            return;
        }

        // 1 char
        acc.add(String.valueOf(array[from] - '0'));
        dfs(array, from + 1);
        acc.remove(acc.size() - 1);

        // 2 char
        if (from + 1 < array.length && array[from] != '0') {

            acc.add(String.valueOf((array[from] - '0') * 10 + (array[from + 1] - '0')));
            dfs(array, from + 2);
            acc.remove(acc.size() - 1);
        }

        // 3 char
        if (from + 2 < array.length && array[from] != '0') {
            int v = (array[from] - '0') * 100 + (array[from + 1] - '0') * 10 + (array[from + 2] - '0');
            if (v < 256){
                acc.add(String.valueOf(v));
                dfs(array, from + 3);
                acc.remove(acc.size()-1);
            }
        }
    }

    private List<String> acc = new ArrayList<>();
    private int pre = -1;
    private List<String> result = new ArrayList<>();
}
