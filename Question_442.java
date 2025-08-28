class Solution {
    public void swap(int[] arr , int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        if(nums.length==1){
            return list;
        }
        else{
            int i = 0;
            while(i<nums.length){
                int correct = nums[i]-1;
                if(nums[i]!=nums[correct]){
                    swap(nums,correct,i);
                }
                else{
                    i++;
                }
            }
        } 
        for(int j=0;j<nums.length;j++){
            if(j!=nums[j]-1){
                list.add(nums[j]);
            }
        }
        return list;
    }
}
