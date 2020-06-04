package org.alking.strings;

public class IsPalindrome {

    public boolean isPalindrome(String s) {
        char[] arr = s.toLowerCase().toCharArray();
        int head = 0;
        int tail = arr.length - 1;
        while (head < tail){

            char h = arr[head];
            char t = arr[tail];

            if(!Character.isLetterOrDigit(h)){
                head = head + 1;
            }else if(!Character.isLetterOrDigit(t)) {
                tail = tail -1;
            }else if(h != t){
                return false;
            }else {
                // h == t
                head = head + 1;
                tail = tail -1;

            }


        }
        return true;
    }
}
