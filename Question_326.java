class Solution {
    public boolean calc(int n,int i){
        if(n == i){
            return true;
        }
        if (i > n || i <= 0) { 
            return false;
        }
        return calc(n, i * 3);
    }
    public boolean isPowerOfThree(int n) {
        if (n < 1) {
            return false;
        }
        if(n == 1){
            return true;
        }
        return calc(n,3);
    }
}
