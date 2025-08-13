class Solution {
    public int fib(int n) {
       int first = 0;
       int second = 1;
       int curr = 0;
       if(n==0||n==1){
        return n;
       }
       else{
        for(int i=2;i<=n;i++){
            curr = first+second;
            first = second;
            second = curr;
        }
       }
       return curr;
    }
}
