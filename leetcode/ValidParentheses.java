import java.util.Stack;

class ValidParentheses {
    public boolean isValid(String s) {
        Stack  <Character> stack = new Stack<>();
        int length = s.length();
        for (int i = 0; i<length; i++){
            if(s.charAt(i) == '('){
                stack.push(')');
            }else if (s.charAt(i) == '{'){
                stack.push('}');
            }else if(s.charAt(i) == '['){
                stack.push(']');
            }
            else{
                if(stack.isEmpty() || stack.peek() != s.charAt(i)){
                    
                return false;
                }else{
                    stack.pop();
                }
            }
        }
            return stack.isEmpty();
    }
}
