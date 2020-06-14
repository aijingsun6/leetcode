package org.alking.math;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {


    public List<String> fizzBuzz(int n) {

        List<String> acc = new ArrayList<>(n);


        for(int i = 1; i <= n; i++){

            if(i % 15 == 0){
                acc.add("FizzBuzz");
            }else if( i %3 == 0){
                acc.add("Fizz");
            }else if(i %5 == 0){
                acc.add("Buzz");
            }else {
                acc.add(String.valueOf(i));
            }
        }

        return acc;

    }
}
