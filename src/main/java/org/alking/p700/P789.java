package org.alking.p700;

public class P789 {

    public boolean escapeGhosts(int[][] ghosts, int[] target) {
        int step = dist(new int[]{0, 0}, target);
        for (int[] p : ghosts) {
            int dist = dist(p, target);
            if (dist <= step) {
                return false;
            }
        }
        return true;

    }

    private int dist(int[] p, int[] target) {
        return Math.abs(p[0] - target[0]) + Math.abs(p[1] - target[1]);
    }
}
