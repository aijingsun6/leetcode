package org.alking.p1100;

public class P1108 {

    public String defangIPaddr(String address) {

        String[] arr = address.split("\\.");
        StringBuffer sb = new StringBuffer();
        sb.append(arr[0]);
        for(int i = 1; i < arr.length;i++){
            sb.append("[.]").append(arr[i]);
        }
        return sb.toString();

    }
}
