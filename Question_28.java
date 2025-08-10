class Solution {
    int count = 0;
    public int strStr(String haystack, String needle) {
        while(haystack.length()>=needle.length()){
            int i = 0;
            if((haystack.substring(i,needle.length())).equals(needle)){
                return count;
            }
            else{
                count++;
                return strStr(haystack.substring(1),needle);
            }
        }
        return -1;
    }
}