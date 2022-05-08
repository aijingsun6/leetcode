package org.alking.p300;

import org.alking.common.ListNode;

import java.util.ArrayList;
import java.util.Random;

public class P382 {

    public static class Solution {

        private ArrayList<Integer> array;
        private int size;

        public Solution(ListNode head) {
            ArrayList<Integer> list = new ArrayList<>();
            size = 0;
            ListNode n = head;
            while (n != null) {
                list.add(n.val);
                n = n.next;
                size += 1;
            }
            this.array = list;
        }

        public int getRandom() {
            int idx = new Random().nextInt(size);
            return array.get(idx);
        }
    }

}
