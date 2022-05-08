package org.alking.p1000;

import java.util.ArrayList;

public class P1078 {

    public String[] findOcurrences(String text, String first, String second) {

        String[] array = text.split(" ");
        ArrayList<String> acc = new ArrayList<>();
        for (int i = 0; i < array.length - 2; i++) {
            if(array[i].equals(first) && array[i+1].equals(second)){
                acc.add(array[i+2]);
            }
        }
        return acc.toArray(new String[0]);
    }
}
