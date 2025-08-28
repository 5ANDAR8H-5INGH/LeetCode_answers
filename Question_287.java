class Solution {
    public void swap(int[] arr , int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public int findDuplicate(int[] nums) {
        int i = 0;
        while(i<nums.length){
            int correct = nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums,correct,i);
            }
            else{
                i++;
            }
        }
        for(int j=0;j<nums.length;j++){
            if(j!=nums[j]-1){
                return nums[j];
            }
        }
        return nums.length;
    }
}
