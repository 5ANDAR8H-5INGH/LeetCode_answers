class Solution {
    int num1 = 0;
    int num2 = 0;
    public int differenceOfSums(int n, int m) {
        if(n == 0 || m == 0){
            return 0;
        }
        for(int i = 1;i<=n;i++){
            if((i%m)!=0){
                num1+=i;
            }
            else{
                num2+=i;
            }
        }
        return num1-num2;
    }
}
