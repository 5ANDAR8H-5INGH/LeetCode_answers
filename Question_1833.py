class Solution(object):
    def maxIceCream(self, costs, coins):
        costs.sort()
        ice_cream = 0    
        for i in costs:
            if(i <= coins):
                ice_cream += 1
                coins -= i 
            else:
                break
        return ice_cream
        
