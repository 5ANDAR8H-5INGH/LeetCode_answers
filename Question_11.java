class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int width = right - left;
            int Area = Math.min(height[left], height[right]) * width;
            maxArea = Math.max(maxArea, Area);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}


// class Solution {
//     public int maxArea(int[] height) {
//         if(height.length == 2){
//             return Math.min(height[0],height[1]);
//         }
//         int Area;
//         int maxArea = 0;
//         int width = 0;
//         for(int i = 0;i<height.length-1;i++){
//             for(int j = i+1;j<height.length;j++){
//                 width++;
//                 Area = (Math.min(height[i],height[j])) * width;
//                 if(Area > maxArea){
//                     maxArea = Area;
//                 }
//             }
//             width = 0;
//         }
//         return maxArea;
//     }
// }
