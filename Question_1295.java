import java.util.*;
class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        if(nums.length==0){
            return -1;
        }
        for(int i=0;i<nums.length;i++){
            if(digit(nums[i])%2==0){
                count+=1;
            }
        }
        return count;
    }
    
    public int digit(int n){
        int length=0;
        while(n>0){
            length++;
            n=n/10;
        }
        return length;
    }
}
