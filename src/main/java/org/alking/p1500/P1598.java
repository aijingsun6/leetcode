package org.alking.p1500;

import java.util.Stack;

public class P1598 {

    public int minOperations(String[] logs) {
        Stack<String> stack = new Stack<>();
        for(String s : logs){
            if(stack.isEmpty()){
                if("../".equals(s) || "./".equals(s)){
                    continue;
                }
                stack.add(s);
            }else {
                if("../".equals(s)){
                    stack.pop();
                }else if("./".equals(s)){
                    continue;
                }else {
                    stack.add(s);
                }

            }
        }
        return stack.size();
    }
}
