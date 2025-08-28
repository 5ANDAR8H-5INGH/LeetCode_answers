class Solution {
    public static void swap(int[] nums,int a,int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    
    public int missingNumber(int[] nums) {
        int i =0;
        while(i<nums.length){
            int correct = nums[i];
            if(correct<nums.length && nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }
            else{
                i++;
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j] != j)
                return j;
        }
        return nums.length;
    }
}