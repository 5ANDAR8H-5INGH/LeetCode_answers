class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();

        helper(candidates, target, 0, new ArrayList<>(), 0, res);
        return res;        
    }

    private void helper(int[] candidates, int target, int idx, List<Integer> comb, int total, List<List<Integer>> res) {
        if (total == target) {
            res.add(new ArrayList<>(comb));
            return;
        }

        if (total > target || idx >= candidates.length) {
            return;
        }

        comb.add(candidates[idx]);
        helper(candidates, target, idx, comb, total + candidates[idx], res);
        comb.remove(comb.size() - 1);
        helper(candidates, target, idx + 1, comb, total, res);
    }    
}
