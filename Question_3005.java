class Solution {
    public int maxFrequencyElements(int[] nums) {
        if (nums.length == 1) {
            return 1;
        }
        Arrays.sort(nums);
        int i = 0;
        int count = 1;
        int maxcount = 0;
        int totalcount = 0;

        while (i < nums.length - 1) {
            if (nums[i] == nums[i + 1]) {
                count++;
            } else {
                if (count > maxcount) {
                    maxcount = count;
                    totalcount = count; 
                } else if (count == maxcount) {
                    totalcount += count;
                }
                count = 1; 
            }
            i++;
        }


        if (count > maxcount) {
            totalcount = count;
        } else if (count == maxcount) {
            totalcount += count;
        }

        return totalcount;
    }
}
