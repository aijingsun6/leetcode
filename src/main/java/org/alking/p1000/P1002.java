package org.alking.p1000;

import java.util.ArrayList;
import java.util.List;

public class P1002 {


    public List<String> commonChars(String[] A) {

        // matrix N * 27
        int[][] arr = new int['z' - 'a' + 1][A.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[A.length];
        }


        for (int i = 0; i < A.length; i++) {
            for (char c : A[i].toCharArray()) {
                arr[c - 'a'][i] += 1;
            }
        }

        List<String> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            int min = arr[i][0];
            for(int v: arr[i]){
                if(v < min){
                    min = v;
                }
            }
            for(int m = 0; m < min; m ++){
                result.add(String.valueOf( (char)(i + 'a')));
            }

        }


        return result;
    }

}
