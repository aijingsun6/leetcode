package org.alking.p100;

public class P151 {

    public String reverseWords(String s) {

        if(s == null || s.isEmpty()){
            return "";
        }
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        boolean first = true;
        for(int i = arr.length-1;i >=0; i--){
            if(!arr[i].trim().equals("")){
                if(first){
                    sb.append(arr[i]);
                    first = false;
                }else {
                    sb.append(" ").append(arr[i]);
                }
            }
        }
        return sb.toString();

    }
}
