package org.alking.p1300;

import java.util.LinkedList;
import java.util.List;

public class P1389 {

    public int[] createTargetArray(int[] nums, int[] index) {

        List<Integer> list = new LinkedList<>();
        int[] target = new int[nums.length];
        for (int i = 0; i < target.length; i++) {
            list.add(index[i],nums[i]);
        }
        for (int i = 0; i < target.length; i++) {
            target[i]=list.get(i);
        }
        return target;

    }
}
