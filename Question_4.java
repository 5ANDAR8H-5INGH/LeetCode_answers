class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged = new int[nums1.length + nums2.length];
        int i=0,j=0;
        for(i = 0 ; i < nums1.length ; i++){
            merged[i] = nums1[i];
        }
        for(j = 0 ; j < nums2.length ; j++){
            merged[i] = nums2[j];
            i++;
        }
        Arrays.sort(merged);
        int len = merged.length;
        int mid = len / 2;
        if((merged.length & 1)==1){
            double ans = merged[mid];
            return ans;
        }
        double ans = (merged[mid] + merged[mid-1]) / 2.0;
        return ans;
    }
}
