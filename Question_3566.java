import java.util.ArrayList;
import java.util.List;

public class Solution {
    public boolean checkEqualPartitions(int[] nums, long target) {
        int n = nums.length;
        List<List<Integer>> subsets = new ArrayList<>();
        
      
        generateSubsets(nums, 0, new ArrayList<>(), subsets);
        
        for (List<Integer> subset : subsets) {
            long prod1 = 1;
            for (int num : subset) {
                prod1 *= num;
            }
            
            if (prod1 == target) {
                List<Integer> remaining = new ArrayList<>();
                for (int num : nums) {
                    if (!subset.contains(num)) {
                        remaining.add(num);
                    }
                }
                
                if (!remaining.isEmpty()) {
                    long prod2 = 1;
                    for (int num : remaining) {
                        prod2 *= num;
                    }
                    
                    if (prod2 == target) {
                        return true;
                    }
                }
            }
        }
        
        return false;
    }

    private void generateSubsets(int[] nums, int index, List<Integer> current, List<List<Integer>> subsets) {
        if (index == nums.length) {
            if (!current.isEmpty()) {
                subsets.add(new ArrayList<>(current));
            }
            return;
        }
        
        
        current.add(nums[index]);
        generateSubsets(nums, index + 1, current, subsets);
        
        
        current.remove(current.size() - 1);
        generateSubsets(nums, index + 1, current, subsets);
    }
} {
    
}
