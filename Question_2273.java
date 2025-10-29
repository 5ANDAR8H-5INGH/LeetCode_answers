class Solution {
    public boolean Anagrams(String s , String t){
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);
        String w1 = new String(s1);
        String w2 = new String(t1);
        return w1.equals(w2);
    }
    public List<String> removeAnagrams(String[] words) {
        ArrayList<String> lst = new ArrayList<>();
        for(int j =0 ; j<words.length ; j++){
            lst.add(words[j]);
        }
        int i = lst.size()-1;
        while(i>0){
            if(Anagrams(lst.get(i),lst.get(i-1))){
                lst.remove(i);
            }
            i--;
        }
        return lst;
    }
}
