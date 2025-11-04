class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            int num = nums1[i];
            int nextGreater = -1;
            boolean found = false;

            // Find num in nums2
            for (int j = 0; j < nums2.length; j++) {
                if (nums2[j] == num) {
                    found = true;
                }
                // Once found, look for the next greater
                if (found && nums2[j] > num) {
                    nextGreater = nums2[j];
                    break;
                }
            }

            res[i] = nextGreater;
        }

        return res;
    }
}
