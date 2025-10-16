class Solution {
    public boolean odd(int n){
        if((n & 1) == 1){
            return true;
        }
        return false;
    }
    public boolean isValid(String s) {
        if(s.length() == 1 || odd(s.length())){
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for(int c = 0 ; c < s.length() ; c++){
            if(s.charAt(c) == '(' || s.charAt(c) == '{' || s.charAt(c) == '[') {
                stack.push(s.charAt(c));
            } 
            else {
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();
                if((s.charAt(c) == ')' && top != '(') || (s.charAt(c) == '}' && top != '{') || (s.charAt(c) == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
