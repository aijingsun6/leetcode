package org.alking.strings;

public class IsAnagram {


    public boolean isAnagram(String s, String t) {

        int size = 'z' - 'a' + 1;
        int[] arr = new int[size];
        for(char c : s.toLowerCase().toCharArray()){
            arr[c -'a'] += 1;
        }
        for(char c: t.toLowerCase().toCharArray()){
            arr[c -'a'] -= 1;
        }
        for(int i:arr){
            if(i != 0){
                return false;
            }
        }
        return true;
    }
}
