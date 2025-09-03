class Solution {
    public String largestGoodInteger(String num) {
        String max = "";
        int i = 0;
        while(i<=num.length()-3){
            if(num.charAt(i) == num.charAt(i+1) && num.charAt(i) == num.charAt(i+2)){
                if(max.equals("") || Integer.parseInt(max)<Integer.parseInt(num.substring(i,i+3))){
                    max = num.substring(i,i+3);
                }
                i = i+3;
            }
            else{
                i++;
            }
        }
        return max;
    }
}