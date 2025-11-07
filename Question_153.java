class Solution {
    public int findMin(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int start = 0;
        int end = nums.length - 1;
        if(nums[start] < nums[end]){
            return nums[start];
        }
        while(start <= end){
            if(end == start + 1){
                return nums[end];
            }
            int mid = start + (end - start)/2;
            if(nums[mid] < nums[start]){
                end = mid;
            }
            else{
                start = mid;
            }
        }
        return -1;
    }
}
