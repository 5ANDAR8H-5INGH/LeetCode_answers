class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
     if(numBottles < numExchange){
            return numBottles;
        }
        return helper(numBottles, numExchange, 0, 0);
    }
    public int helper(int numBottles, int numExchange, int emptyBottle, int sum){
        if(emptyBottle < numExchange && numBottles == 0){
            return sum;
        }
        sum += numBottles;
        emptyBottle += numBottles;
        numBottles = 0;
        while(emptyBottle >= numExchange){
            numBottles++;
            emptyBottle = emptyBottle - numExchange;
            numExchange++;
        }
        
        return helper(numBottles, numExchange, emptyBottle, sum);
    }
}
