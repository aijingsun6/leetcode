package org.alking.p800;

import java.util.ArrayDeque;
import java.util.List;

public class P841 {

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {

        if (rooms == null || rooms.size() < 2) {
            return true;
        }

        if (rooms.get(0).isEmpty()) {
            return false;
        }

        ArrayDeque<Integer> queue = new ArrayDeque<>();
        boolean[] visit = new boolean[rooms.size()];
        visit[0] = true;
        queue.addLast(0);
        int sum = 1;
        while (!queue.isEmpty()) {
            Integer first = queue.removeFirst();
            for (Integer r : rooms.get(first)) {
                if (!visit[r]) {
                    sum += 1;
                    visit[r] = true;
                    queue.addLast(r);
                }
            }
        }


        return sum >= rooms.size();

    }


}
