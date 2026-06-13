class Solution {
    public boolean judgeCircle(String moves) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0 ; i < moves.length() ; i++){
            if(map.containsKey(moves.charAt(i))){
                int value = map.get(moves.charAt(i)) + 1;
                map.put(moves.charAt(i),value);
            }
            else{
                map.put(moves.charAt(i),1);
            }
        }
        if((map.getOrDefault('R',0) - map.getOrDefault('L',0) + map.getOrDefault('U',1) - map.getOrDefault('D',1)) == 0){
            return true;
        }
        return false;
    }
}
