package org.alking.p1100;

public class P1160 {

    public int countCharacters(String[] words, String chars) {
        int[] source = new int['z' - 'a' + 1];
        for( char c : chars.toCharArray()){
            source[c - 'a'] ++;
        }
        int sum = 0;
        for(String word: words){
            sum += count(word, source);
        }
        return sum;
    }

    private int count(String word, int[] source) {
        int[] arr = new int[source.length];
        System.arraycopy(source, 0, arr, 0, source.length);
        for (char c : word.toCharArray()) {

            int idx = c - 'a';
            if(arr[idx] == 0){
                return 0;
            }
            arr[idx] = arr[idx] -1;

        }
        return word.length();
    }
}
