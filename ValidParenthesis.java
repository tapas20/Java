import java.util.Stack;

public class ValidParenthesis {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                stack.push(ch);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                if(ch==')' && stack.peek() != '('){
                    return false;
                }
                if(ch==']' && stack.peek() != '['){
                    return false;
                }
                if(ch=='}' && stack.peek() != '{'){
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("()")); 
        System.out.println(isValid("()[]{}")); 
        System.out.println(isValid("(]")); 
        System.out.println(isValid("([)]")); 
        System.out.println(isValid("{[]}"));
        System.out.println(isValid("{[()]}"));
    }
}
