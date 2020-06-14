package org.alking.other;

import java.util.Stack;

public class ValidBrackets {


    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {

            switch (c) {
                case '(':
                case '[':
                case '{':
                    stack.push(c);
                    break;
                case ')':
                case ']':
                case '}':

                    if(stack.isEmpty()){
                        return false;
                    }

                    char t = '(';
                    if(c == ']'){
                        t = '[';
                    }else if(c == '}'){
                        t = '{';
                    }
                    if(stack.pop() != t){
                        return false;
                    }
                    break;
                default:
                    break;
            }


        }

        return stack.isEmpty();
    }
}
