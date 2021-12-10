package org.alking.p700;

public class P748 {

    private int[] buildCntArray(String word) {
        int[] arr = new int['z' - 'a' + 1];
        for (char c : word.toCharArray()) {
            c = Character.toLowerCase(c);
            if (c >= 'a' && c <= 'z') {
                arr[c - 'a'] += 1;
            }else if (c >= 'A' && c <= 'Z'){
                arr[c - 'A'] += 1;
            }
        }
        return arr;
    }

    private boolean check(int[] src, String word){

        int[] w = buildCntArray(word);
        for(int i = 0;i < src.length;i++){
            if(src[i] > w[i]){
                return false;
            }
        }
        return true;

    }


    public String shortestCompletingWord(String licensePlate, String[] words) {
        final int[] src = buildCntArray(licensePlate);
        String result = null;
        for(String s: words){
            if(check(src,s)){
                if (result == null){
                    result = s;
                }else if(s.length() < result.length()){
                    result = s;
                }
            }
        }
        return result;

    }
}
