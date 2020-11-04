package org.alking.p800;

public class P806 {

    public int[] numberOfLines(int[] widths, String S) {
        int max = 100;
        int line = 0;
        int acc = 0;
        for(int i = 0; i < S.length();i++){
            char c = S.charAt(i);
            int add = widths[c - 'a'];
            int acc2 = acc + add;
            if(acc2 > max){
                line += 1;
                acc = add;
            }else{
                acc = acc2;
            }
        }
        return new int[]{line+1,acc};
    }
}
