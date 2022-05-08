package org.alking.p1400;

import java.util.HashSet;

public class P1496 {

    public boolean isPathCrossing(String path) {

        HashSet<Integer> set = new HashSet<>();

        int x = 0;
        int y = 0;
        set.add(0);
        for (int i = 0; i < path.length(); i++) {
            char c = path.charAt(i);
            if (c == 'N') {
                y++;
            } else if (c == 'S') {
                y--;
            } else if (c == 'E') {
                x++;
            } else if (c == 'W') {
                x--;
            }
            Integer s = 10000 * x + y;
            if (set.contains(s)) {
                return true;
            }
            set.add(s);
        }
        return false;
    }
}
