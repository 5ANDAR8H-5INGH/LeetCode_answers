class Solution {
    public int totalMoney(int n) {
        if(n==1){
            return n;
        }
        int sum = 0;
        int prevMon = 1;
        int increase = 0;
        for(int i = 1 ; i <= n ; i++){
            increase++;
            sum += increase;
            if(i%7==0){
                increase = prevMon;
                prevMon++;
            }
        }
        return sum;
    }
}
