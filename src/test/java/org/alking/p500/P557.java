package org.alking.p500;

import java.util.ArrayList;
import java.util.List;

public class P557 {

    public String reverseWords(String s) {

        if(s == null || s.isEmpty()){
            return "";
        }

        String[] arr = s.split(" ");
        List<String> list = new ArrayList<>(arr.length);
        for(String e: arr){
            list.add(new StringBuilder(e).reverse().toString());
        }

        return String.join(" ",list);
    }
}
