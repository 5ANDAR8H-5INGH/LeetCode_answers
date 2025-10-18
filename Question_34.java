class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length == 0){
            return new int[]{-1,-1};
        }
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;
        while(start <= end){
            int mid = start + ((end-start)/2);
            if(nums[mid] == target){
                ans = mid;
                break;
            }
            else if(target < nums[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        if(ans == -1){ 
            return new int[]{-1,-1};
        }
        int left = ans;
        int right = ans;
        while(left > 0 && nums[left-1] == target){
            left--;
        }
        while(right < nums.length-1 && nums[right+1] == target){
            right++;
        }
        return new int[]{left,right};
    }
}
