package org.alking.p900;

public class P953 {

    private boolean small(String a, String b, int[] bucket) {
        int lA = a.length();
        int lB = b.length();
        int min = Math.min(lA, lB);
        for (int i = 0; i < min; i++) {
            char cA = a.charAt(i);
            char cB = b.charAt(i);
            int idxA = cA - 'a';
            int idxB = cB - 'a';
            if (bucket[idxA] > bucket[idxB]) {
                return false;
            }else if(bucket[idxA] < bucket[idxB]){
                return true;
            }
        }

        if (lA < lB) {
            return true;
        }else if(lA > lB){
            return false;
        }
        return true;

    }

    public boolean isAlienSorted(String[] words, String order) {

        int[] bucket = new int['z' - 'a' + 1];
        for (int i = 0; i < order.length(); i++) {
            bucket[order.charAt(i) - 'a'] = i;
        }

        for (int i = 0; i < words.length - 1; i++) {
            if (!small(words[i], words[i + 1], bucket)) {
                return false;
            }
        }
        return true;
    }

}
