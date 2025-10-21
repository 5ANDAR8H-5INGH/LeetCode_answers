class Solution {
    public int minAddToMakeValid(String s) {
        if(s.length() == 1){
            return 1;
        }
        Stack<Character> stk = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == '('){
                stk.push(ch);
            }
            else if(ch == ')'){
                if(stk.isEmpty() || stk.peek() == ')'){
                    stk.push(ch);
                }
                else{
                    stk.pop();
                }
            }
        }
        // int count = 0;
        // while(!(stk.isEmpty())){
        //     stk.pop();
        //     count++;
        // }
        return stk.size();
    }
}
