class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0){
            return 0;
        }
        String str = "";
        String lstr = "";
        for(int i = 0 ; i < s.length() ; i++){
            for(int j = i ; j < s.length() ; j++){
                if(str.indexOf(s.charAt(j)) < 0){
                    str += s.charAt(j);
                }
                else{
                    break;
                }
            }
            if(lstr.length() <= str.length()){
                lstr = str;
            }
            str = "";
        }
        return lstr.length();
    }
}
