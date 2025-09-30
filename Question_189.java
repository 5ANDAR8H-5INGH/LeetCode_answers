class Solution {
    public void shift(int[] nums, int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if(n == 0 || k % n == 0) {
            return;
        }
        int shift = k % n;
        shift(nums, 0, n-1);
        // reverse first k
        shift(nums, 0, shift-1);
        // reverse rest
        shift(nums, shift, n-1);
    }
}


// class Solution {
//     public void shift(int[] nums){
//         int temp = nums[nums.length - 1];
//         for(int i = nums.length - 2 ; i >= 0 ; i--){
//             nums[i+1] = nums[i];
//         }
//         nums[0] = temp;
//     }
//     public void rotate(int[] nums, int k) {
//         if(k == 0 || k % nums.length == 0){
//             return;
//         }
//         int shift = k % nums.length;
//         int i = 1;
//         while(i <= shift){
//             shift(nums);
//             i++;
//         }
//     }
// }
