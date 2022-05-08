package org.alking.p600;

public class P678 {


    public boolean checkValidString(String s) {

        if (s.isEmpty()) {
            return true;
        }
        res = false;
        array = s.toCharArray();
        dfs(0, 0);
        return res;
    }

    private boolean res = false;
    private char[] array;

    private void dfs(int from, int acc) {
        if (res) {
            return;
        }
        if (from >= array.length) {
            if (acc == 0) {
                res = true;
            }
            return;
        }
        char c = array[from];
        if (c == '(') {
            dfs(from + 1, acc + 1);
        } else if (c == ')' && acc > 0) {
            dfs(from + 1, acc - 1);
        } else if (c == '*') {
            dfs(from + 1, acc);
            dfs(from + 1, acc + 1);
            if (acc > 0){
                dfs(from + 1, acc - 1);
            }
        }

    }
}
