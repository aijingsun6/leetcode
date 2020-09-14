package org.alking.p1600;

public class P1682 {

    public boolean isUnique(String astr) {

        if(astr == null || astr.length() < 2){
            return true;
        }

        boolean[] exist = new boolean['z'-'a'+1];

        for(char c: astr.toCharArray()){

            if(exist[c -'a']){
                return false;
            }
            exist[c -'a'] = true;

        }
        return true;
    }
}
