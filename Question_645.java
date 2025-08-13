class Solution {
    public void swap(int[]arr , int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public int[] findErrorNums(int[] nums) {
        int j =0;
        while(j<nums.length){
            int correct = nums[j] - 1;
            if(nums[j]!=nums[correct]){
                swap(nums,j,correct);
            }
            else{
                j++;
            }
        }
        int[] arr = new int[2];
        for(int i=0;i<nums.length;i++){
            if(i!=nums[i]-1){
                arr[0] = nums[i];
                arr[1] = i + 1;
            }
        }
        return arr;
    }
}