package algorithms.ValidParentheses;

import java.util.Stack;

/**
 * Created by fisbii on 16-9-18.
 */
public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                stack.push(s.charAt(i));
            }else if(s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']'){
                if(stack.empty()) return false;
                char c = stack.pop();
                if(!isMatch(c,s.charAt(i)))
                    return false;
            }
        }
        return stack.empty();
    }

    private boolean isMatch(char c, char c1) {
        return (c == '(' && c1 == ')') || (c == '{' && c1 == '}') || (c == '[' && c1 == ']');
    }
}
