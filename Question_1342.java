class Solution {
    int count = 0;
    public int numberOfSteps(int num) {
        if(num==0){
            return count;
        }
        else if((num & 1) == 1){
            count++;
            numberOfSteps(num-1);
        }
        else{
            count++;
            numberOfSteps(num/2);
        }
        return count;
    }
}