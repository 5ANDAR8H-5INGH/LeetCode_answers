class Solution {
    public int[] singleNumber(int[] nums) {
        if(nums.length == 2){
            return nums;
        }
        int[] res = new int[2];
        Set<Integer> set = new HashSet<>();
        for(int i = 0 ; i < nums.length ; i++){
            if(set.contains(nums[i])){
                set.remove(nums[i]);
            }
            else{
                set.add(nums[i]);
            }
        }
        int i = 0;
        for (Integer element : set) {
            res[i] = element;
            i++;
        }
        return res;
    }
}
