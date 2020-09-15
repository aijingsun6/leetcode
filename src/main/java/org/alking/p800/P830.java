package org.alking.p800;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P830 {

    public List<List<Integer>> largeGroupPositions(String s) {

        List<List<Integer>> acc = new ArrayList<>();
        char[] arr = s.toCharArray();
        int start = 0;
        char c = arr[start];


        for (int i = 1; i < arr.length; i++) {

            if(arr[i] == c){
                continue;
            }

            if(i - start > 2){
                acc.add(Arrays.asList(start, i - 1));
            }

            start = i;
            c = arr[i];

        }
        int end  = arr.length - 1;
        if(arr[end] == arr[start] && end - start >= 2){
            acc.add(Arrays.asList(start, end));
        }

        return acc;
    }
}
