class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        Arrays.sort(nums);
        int i;
        for(i = 0; i+1 < nums.length; i += 2){
            if(nums[i]!=nums[i+1]){
                return nums[i];
            }
        }
        if(i<nums.length){
            return nums[i];
        }
        return -1;
    }
}
