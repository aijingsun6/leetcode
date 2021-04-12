package org.alking.p200;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class P220 {

    public static class P220Node {

        private int value;

        private ArrayList<Integer> idxList = new ArrayList<>();


        public int getValue() {
            return value;
        }

        public ArrayList<Integer> getIdxList() {
            return idxList;
        }

        public void addIdx(int idx) {
            this.idxList.add(idx);
        }

        public P220Node(int value) {
            this.value = value;
        }
    }


    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {

        // build sort map value -> idx list
        TreeMap<Integer, P220Node> map = new TreeMap<>();
        for (int i = 0; i < nums.length; i++) {
            int v = nums[i];
            if(map.containsKey(v)){
                ArrayList<Integer> idxList = map.get(v).getIdxList();
                for(int idx : idxList){

                    if(Math.abs(idx - i) <= k){
                        return true;
                    }

                }
                idxList.add(i);
            }else {
                P220Node n = new P220Node(v);
                n.addIdx(i);
                map.put(v, n);
            }
        }
        //
        P220Node[] nodes = new P220Node[map.size()];
        int idx = 0;
        for(Map.Entry<Integer,P220Node> e : map.entrySet()){
            nodes[idx++] = e.getValue();
        }
//        for(Map.Entry<Integer,P220Node> e: map.entrySet()){
//            int v = e.getKey();
//            ArrayList<Integer> idxList = e.getValue().getIdxList();
//
//
//        }

        return false;


    }
}
