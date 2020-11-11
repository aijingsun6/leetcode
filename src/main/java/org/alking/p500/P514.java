package org.alking.p500;

import java.util.ArrayList;

public class P514 {

    public int findRotateSteps(String ring, String key) {
        init(ring);
        bfs(ring, 0, key, 0, 0);
        return min + key.length();
    }

    private int min = Integer.MAX_VALUE;
    ArrayList<Integer>[] map = new ArrayList['z' - 'a' + 1];

    private void init(String ring) {
        map = new ArrayList['z' - 'a' + 1];
        for (int i = 0; i < ring.length(); i++) {
            char c = ring.charAt(i);
            int idx = c - 'a';
            if (map[idx] == null) {
                map[idx] = new ArrayList<>();
            }
            map[idx].add(i);
        }
        min = Integer.MAX_VALUE;
    }

    private void bfs(String ring, int ringIdx, String key, int keyIdx, int acc) {
        if (keyIdx == key.length()) {
            min = Math.min(min, acc);
            return;
        }
        char c = key.charAt(keyIdx);
        ArrayList<Integer> idxList = map[c - 'a'];
        for (int idx : idxList) {
            int dist = (idx + ring.length() - ringIdx) % ring.length();
            bfs(ring, idx, key, keyIdx + 1, acc + dist);

            dist = (ringIdx + ring.length() - idx) % ring.length();
            bfs(ring, idx, key, keyIdx + 1, acc + dist);
        }
    }


}
