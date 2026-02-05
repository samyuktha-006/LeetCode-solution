// Last updated: 2/5/2026, 10:19:04 AM
class Solution {
    public int missingNumber(int[] nums) {
          int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        
        for (int num : nums) {
            actualSum += num;
        }
        
        return expectedSum - actualSum;


    }
}