class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int[] pairs = new int[spells.length];
        for (int i = 0; i < spells.length; i++) {
            int start = 0;
            int end = potions.length - 1;
            int idx = potions.length;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                long product = (long) spells[i] * potions[mid];
                if (product >= success) {
                    idx = mid;
                    end = mid - 1; 
                } else {
                    start = mid + 1;
                }
            }
            pairs[i] = potions.length - idx; 
        }
        return pairs;
    }
}
