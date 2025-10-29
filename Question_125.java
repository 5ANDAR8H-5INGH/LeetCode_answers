class Solution {
    public boolean isPalindrome(String s) {
        String str = "";
        int i = 0;
        while(i < s.length()){
            if(!Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }
            else{
                str += Character.toLowerCase(s.charAt(i));
                i++;
            }
        }
        int j = 0;
        int k = str.length()-1;
        while(j<k){
            if(str.charAt(j) == str.charAt(k)){
                j++;
                k--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
