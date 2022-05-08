package org.alking.p0;

import java.util.ArrayDeque;

public class P71 {

    public String simplifyPath(String path) {
        ArrayDeque<String> stack = new ArrayDeque<>();
        int idx = 0;
        int N = path.length();
        while (idx < N){
            if(path.charAt(idx) == '/'){
                idx += 1;
                continue;
            }

            StringBuilder sb = new StringBuilder();
            while (idx < N && path.charAt(idx) != '/'){
                sb.append(path.charAt(idx));
                idx += 1;
            }
            String s = sb.toString();
            if("..".equals(s) && !stack.isEmpty()){
                stack.removeLast();
            }else if(!"..".equals(s) && !".".equals(s)){
                stack.addLast(s);
            }
        }

        if(stack.isEmpty()){
            return "/";
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()){
            sb.append("/").append(stack.removeFirst());
        }
        return sb.toString();
    }
}
