class Solution {
    public void swap(int[] row , int a, int b){
        int temp = row[a];
        row[a] = row[b];
        row[b] = temp;
    }
    public int search(int[] row, int start, int end, int target){
        for(int i=start; i<=end; i++){
            if(row[i] == target){
                return i;
            }
        }
        return -1; 
    }
    public int minSwapsCouples(int[] row) {
        int minSwap = 0;
        int next = 0;
        for(int i = 0;i<row.length;i+=2){
            if((row[i]&1)!=1){
                next = row[i] + 1;
            }
            else{
                next = row[i] - 1;
            }
            if(row[i+1]!=next){
                swap(row,i+1,search(row,i+1,row.length-1,next));
                minSwap++;
            }
        }
        return minSwap;
    }
}
