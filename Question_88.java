public class Question_88 {
    class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums3 = new int[nums1.length];
        if(m==0){
        for (int g = 0; g < nums2.length; g++) {
            nums1[g] = nums2[g];
        }
        }
        else if(nums2.length==0){
            return;
        }
        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                nums3[k++] = nums1[i++];
            } else {
                nums3[k++] = nums2[j++];
            }
        }
        while (i < m) {
            nums3[k++] = nums1[i++];
        }
        while (j < n) {
            nums3[k++] = nums2[j++];
        }
    for (int p = 0; p < nums3.length; p++) {
        nums1[p] = nums3[p];
    }
        return;
    }
}
    
}
