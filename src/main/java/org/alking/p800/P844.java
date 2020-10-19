package org.alking.p800;

public class P844 {

    public boolean backspaceCompare(String S, String T) {
        S = convert(S);
        T = convert(T);
        return S.compareTo(T) == 0;
    }

    public String convert(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }
        char[] arr = s.toCharArray();
        int count = 0;
        for(int idx = 0; idx < arr.length;idx++){
            char c = arr[idx];
            if(c == '#' && count > 0){
                count --;
            }else if(c != '#'){
                arr[count++] = c;
            }
        }
        return new String(arr,0,count);
    }


}
