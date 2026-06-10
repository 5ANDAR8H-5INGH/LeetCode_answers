class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int[] ans = new int[k];
        for(int ele : nums){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>((a, b) -> b.getValue().compareTo(a.getValue()));
        maxHeap.addAll(map.entrySet());
        int i = k;
        while(i != 0){
            Map.Entry<Integer, Integer> entry = maxHeap.poll();
            ans[i-1] = entry.getKey();
            i--; 
        }
        return ans;
    }
}
