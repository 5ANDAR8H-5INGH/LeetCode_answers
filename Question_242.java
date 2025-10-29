class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        String s1 = new String(str1);
        String t1 = new String(str2);
        if(s1.equals(t1)){
            return true;
        }
        return false;
    }
}
