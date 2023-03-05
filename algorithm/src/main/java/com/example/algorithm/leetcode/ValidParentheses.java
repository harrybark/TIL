package com.example.algorithm.leetcode;

import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s) {

        int len = s.length();
        if( len % 2 != 0) {
            return false;
        }

        Stack<Character> stack = new Stack<>();

        for ( char curn : s.toCharArray() ) {

            if ( curn == '(' || curn == '{' || curn == '[' ) {
                stack.push(curn);
            }
            // 닫힌 괄호로만 구성된 경우
            else if ( stack.size() == 0 ) {
                return false;
            }
            // 선입선출이므로
            else if ( curn == ')' ) {
                if ( stack.pop() != '(') {
                    return false;
                }
            }
            else if ( curn == '}' ) {
                if ( stack.pop() != '{') {
                    return false;
                }
            }
            else if ( curn == ']' ) {
                if ( stack.pop() != '[') {
                    return false;
                }
            }
        }

        return stack.size() == 0;
    }
}
