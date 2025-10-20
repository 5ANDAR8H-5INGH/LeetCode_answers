class Solution {
    public int largestRectangleArea(int[] heights) {
        if(heights.length == 1){
            return heights[0];
        }
        int n = heights.length;
        int[] left = new int[n];  
        int[] right = new int[n];  
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                left[i] = -1; 
            } else {
                left[i] = st.peek();
            }
            st.push(i);
        }
        st.clear();
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                right[i] = n;  
            } else {
                right[i] = st.peek();
            }
            st.push(i);
        }
        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            int width = right[i] - left[i] - 1;
            int area = heights[i] * width;
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }
}


// class Solution {
//     public int left(int[] heights,int i){
//         int left = i-1;
//         while(left>=0 && heights[left]>=heights[i]){
//             left--;
//         }
//         return left;
//     }
//     public int right(int[] heights,int i){
//         int right = i+1;
//         while(right<=heights.length-1 && heights[right]>=heights[i]){
//             right++;
//         }
//         return right;
//     }
//     public int largestRectangleArea(int[] heights) {
//         if(heights.length == 1){
//             return heights[0];
//         }
//         int maxArea = 0;
//         int Area = 0;
//         for(int i = 0 ; i < heights.length ; i++){
//             Area = heights[i] * (right(heights, i) - left(heights, i) - 1);
//             maxArea = Math.max(maxArea,Area);
//         }
//         return maxArea;
//     }
// }
