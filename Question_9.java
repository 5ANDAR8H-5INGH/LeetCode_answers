class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false; 
        }
        int n=x;
        int r=0;
        while(x!=0){
            int i = x%10;
            r = i+10*r;
            x = x/10;
        }
        return r == n;  
    }
}