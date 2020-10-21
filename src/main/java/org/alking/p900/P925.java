package org.alking.p900;

public class P925 {

    public boolean isLongPressedName(String name, String typed) {
        if (typed == null || typed.length() < name.length()) {
            return false;
        }
        if(typed.length() == name.length()){
            return typed.equals(name);
        }
        int idx = 0;
        int idxT = 0;
        while (idx < name.length() && idxT < typed.length()) {
            char c1 = name.charAt(idx);
            char c2 = typed.charAt(idxT);
            if (c1 == c2) {
                idx += 1;
                idxT += 1;
                continue;
            }
            if (idx > 0 && c2 == name.charAt(idx - 1)) {
                idxT += 1;
                continue;
            }
            return false;
        }
        if (idx < name.length()) {
            return false;
        }
        char last = name.charAt(name.length() - 1);
        for (int i = idxT; i < typed.length(); i++) {
            if (last != typed.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
