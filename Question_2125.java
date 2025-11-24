class Solution {
    public boolean isZero(String str){
        for(char c : str.toCharArray()){
            if(c!='0'){
                return false;
            }
        }
        return true;
    }
    public int count1(String str){
        int count = 0;
        for(char c : str.toCharArray()){
            if(c!='0'){
                count += 1;
            }
        }
        return count;
    }
    public int numberOfBeams(String[] bank) {
        if(bank.length == 1){
            return 0;
        }
        int res = 0;
        int i = 0;
        while(i < bank.length && isZero(bank[i])){
            i++;
        }
        int j = i+1;
        while(j<bank.length){
            if(j < bank.length && isZero(bank[j])){
                j++;
            }
            else if(j < bank.length){
                res += (count1(bank[i]) * count1(bank[j]));
                i = j;
                j += 1;
            }
        }
        return res;
    }
}
