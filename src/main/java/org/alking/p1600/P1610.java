package org.alking.p1600;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P1610 {

    public int visiblePoints(List<List<Integer>> points, int angle, List<Integer> location) {
        int sameCnt = 0;
        List<Double> as = new ArrayList<>();
        for (List<Integer> e : points) {
            if (e.get(0).equals(location.get(0)) && e.get(1).equals(location.get(1))) {
                sameCnt++;
            } else {
                as.add(calcAngle(location, e));
            }
        }

        Collections.sort(as);

        int size = as.size();
        List<Double> list = new ArrayList<>();
        list.addAll(as);
        for (Double d : as) {
            list.add(d + 360);
        }
        int max = 0;
        int left = 0;
        int right = 0;
        int cnt = 1;
        // 滑动窗口
        while (left < size) {
            while ((right - left < size) && (list.get(right + 1) - list.get(left)) <= (double) angle) {
                cnt++;
                right++;
            }
            max = Math.max(max, cnt);
            left++;
            cnt--;
        }
        return max + sameCnt;
    }

    private double calcAngle(List<Integer> location, List<Integer> target) {
        int dy = target.get(1) - location.get(1);
        int dx = target.get(0) - location.get(0);
        if (dx == 0 && dy > 0) {
            return 90d;
        } else if (dx == 0 && dy < 0) {
            return -90d;
        } else if (dy == 0 && dx > 0) {
            return 0d;
        } else if (dy == 0 && dx < 0) {
            return 180d;
        }
        if(dx > 0){
            return Math.toDegrees( Math.atan((double) dy / (double) dx) );
        }
        return Math.toDegrees( Math.atan((double) dy / (double) dx) ) + 180d;
    }

}
