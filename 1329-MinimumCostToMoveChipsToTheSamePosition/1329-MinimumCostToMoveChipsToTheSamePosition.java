// Last updated: 2/5/2026, 10:18:37 AM
class Solution {
    public int minCostToMoveChips(int[] position) {
         int evenCount = 0;
        int oddCount = 0;
        
        for (int pos : position) {
            if (pos % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        
        return evenCount<oddCount?evenCount:oddCount;

    }
}