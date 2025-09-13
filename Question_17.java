class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty()){
            return new ArrayList<>();
        }
        return helper("",digits); // using helper function
    }
    public List<String> helper(String p,String digits){
        if(digits.isEmpty()){
            ArrayList<String> List = new ArrayList<>();
            List.add(p);
            return List;
        }
        int digit = digits.charAt(0) - '0'; // First character
        ArrayList<String> List = new ArrayList<>();
        if(digit<7){
            for(int i = (digit-2)*3;i<((digit-1)*3);i++){
                char ch = (char)('a'+i);
                List.addAll(helper(p+ch,digits.substring(1)));
            }
        }
            // seprate case for last
        else if(digit == 7){
            for(int i = 15; i < 19; i++){
                char ch = (char)('a' + i);
                List.addAll(helper(p+ch,digits.substring(1)));
            }
        }
        else if(digit == 8){
            for(int i = 19; i < 22; i++){
                char ch = (char)('a' + i);
                List.addAll(helper(p+ch,digits.substring(1)));
            }
        }
        else if(digit == 9){
            for(int i = 22; i < 26; i++){
                char ch = (char)('a' + i);
                List.addAll(helper(p+ch,digits.substring(1)));
            }
        }
        return List; // returning merged list
    }
}
