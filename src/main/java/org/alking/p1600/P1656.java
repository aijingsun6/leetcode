package org.alking.p1600;

import java.util.ArrayList;
import java.util.List;

public class P1656 {

    class OrderedStream {

        private String[] array;
        private int ptr = 1;

        public OrderedStream(int n) {
            array = new String[n + 1];
        }
        public List<String> insert(int idKey, String value) {
            array[idKey] = value;
            List<String> result = new ArrayList<>();
            while (ptr < array.length){
                String s = array[ptr];
                if(s != null){
                    result.add(s);
                    ptr ++;
                }else{
                    break;
                }
            }
            return result;
        }
    }
}
