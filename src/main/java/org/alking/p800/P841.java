package org.alking.p800;

import java.util.ArrayDeque;
import java.util.HashSet;
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
        HashSet<Integer> visit = new HashSet<>();
        visit.add(0);
        queue.addLast(0);

        while (!queue.isEmpty()) {
            Integer first = queue.removeFirst();
            for (Integer r : rooms.get(first)) {

                if (!visit.contains(r)) {
                    visit.add(r);
                    queue.addLast(r);
                }
            }
        }

        return visit.size() >= rooms.size();

    }
}
