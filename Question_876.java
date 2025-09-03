class Solution {
    public boolean isHappy(int n) {
        // Floyd’s cycle detection
        int slow = n;
        int fast = n;
        do{
            slow = findsqr(slow);
            fast = findsqr(findsqr(fast));
        }while(slow!=fast);
        if(slow==1){
            return true;
        }
        return false;
    }
    public int findsqr(int n){
        int ans = 0;
        while(n>0){
            int rem = n%10;
            ans+=rem*rem;
            n/=10;
        }
        return ans;
    }
}
