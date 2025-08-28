class Solution {
    public boolean check(int[] nums) {
        if (nums.length != 3) 
            return false;
    
        int a = nums[0], b = nums[1], c = nums[2];
            return (a + b > c) && (a + c > b) && (b + c > a);
    }
    public String triangleType(int[] nums) {
        if(nums[0]==nums[1] && nums[1]==nums[2]){
            return "equilateral";
        }
        else if((nums[0]==nums[1] && nums[1]!=nums[2]) || (nums[0]!=nums[1] && nums[1]==nums[2]) || (nums[0]==nums[2] && nums[2]!=nums[1])){
            if(check(nums)){
                return "isosceles";
            }
        }
        else if((nums[0]!=nums[1]) && (nums[1]!=nums[2]) && (nums[0]!=nums[2])){
            if(check(nums)){
                return "scalene";
            }
        }
        return "none";
    }
    
}
