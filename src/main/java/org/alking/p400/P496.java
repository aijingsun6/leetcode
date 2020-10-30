package org.alking.p400;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;

public class P496 {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int v;
        int first;
        int size;
        for (int i = 0; i < nums2.length; i++) {
            v = nums2[i];
            if(queue.isEmpty()){
                queue.addLast(v);
                continue;
            }
            size = queue.size();
            for(int j = 0; j < size; j ++){
                first = queue.pollFirst();
                if(first < v){
                    map.put(first,v);
                }else {
                    queue.addLast(first);
                }
            }
            queue.addLast(v);
        }
        for(int v2: queue){
            map.put(v2,-1);
        }
        for(int i = 0; i < nums1.length;i++){
            res[i]=map.get(nums1[i]);
        }
        return res;
    }
}
