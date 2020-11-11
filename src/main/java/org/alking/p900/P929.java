package org.alking.p900;

import java.util.HashSet;

public class P929 {

    private String convertEmail(final String email){
        char[] array = email.toCharArray();
        String pre = null;
        String suffix = null;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < array.length;i++){
            char c = array[i];

            if(c == '.'){
                continue;
            }
            if(c == '+'){
                if(pre == null){
                    pre = sb.toString();
                }

            }
            if(c == '@'){
                suffix = String.valueOf(array,i + 1,array.length-i-1);
                break;
            }
            sb.append(c);
        }
        if(pre == null){
            pre = sb.toString();
        }
        return pre + "@" + suffix;
    }

    public int numUniqueEmails(String[] emails) {
        HashSet<String> set = new HashSet<>();
        for(String s: emails){
            set.add(convertEmail(s));
        }
        return set.size();
    }
}
