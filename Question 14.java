class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        if(strs.length == 1){
            return strs[0];
        }
        String temp = strs[0];
        String common = "";
        for(int i = 1 ; i < strs.length ; i++){
            for(int j = 0 ; j < strs[i].length() && j < temp.length() ; j++){
                if(strs[i].charAt(j) == temp.charAt(j)){
                    common += strs[i].charAt(j);
                }
                else{
                    break;
                }
            }
            temp = common;
            common = "";
        }
        return temp;
    }
}
