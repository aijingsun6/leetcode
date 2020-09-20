package org.alking.p1500;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P1566 {

    public boolean containsPattern(int[] arr, int m, int k) {

        HashMap<Integer,List<Integer>> map = new HashMap<>();
        for(int idx = 0; idx < arr.length;idx++){
            int v = arr[idx];
            if(map.containsKey(v)){
                List<Integer> list = map.get(v);
                list.add(idx);
            }else {
                List<Integer> list = new ArrayList<>();
                list.add(idx);
                map.put(v,list);
            }
        }

        for(Map.Entry<Integer,List<Integer>> entry: map.entrySet()){
            List<Integer> idxList = entry.getValue();
            if(idxList.size() >= k){
                if(checkIndex(arr,idxList,m)){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean checkIndex(int[] arr, List<Integer> idxList, int m){
        for(int i = 1; i < m; i++){
            int start = -1;
            for(int idx: idxList){
                int v = arr[idx + i];
                if(start < 0){
                    start = v;
                }else if(v != start){
                    return false;
                }

            }
        }
        return true;

    }
}
