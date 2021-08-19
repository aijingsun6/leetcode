package org.alking.p1600;

public class P1668 {

    public int maxRepeating(String sequence, String word) {
       String tmp = word;
       int acc = 0;
       while (sequence.contains(tmp)){
           acc += 1;
           tmp += word;
       }
       return acc;
    }
}
