class Solution {
    public int maxcount(ArrayList<Character> lst){
        int maxcount = 0;
        for(int i = 0 ; i < lst.size() ; i++){
            int count = 1;
            for(int j = i+1 ; j < lst.size() ; j++){
                if(lst.get(i)==lst.get(j)){
                    count += 1;
                }
            }
            if(maxcount<count){
                maxcount = count;
            }
        }
        return maxcount;
    }
    public int maxFreqSum(String s) {
        if(s == null){
            return 0;
        }
        ArrayList<Character> conso = new ArrayList<>();
        ArrayList<Character> vowel = new ArrayList<>();
        for(int i = 0 ; i<s.length() ; i++){
            if(s.charAt(i)=='a'|| s.charAt(i)=='e'|| s.charAt(i)=='i'|| s.charAt(i)=='o'|| s.charAt(i)=='u'){
                vowel.add(s.charAt(i));
            }
            else{
                conso.add(s.charAt(i));
            }
        }
        int c = maxcount(conso);
        int v = maxcount(vowel);
        return c + v;
    }
}
