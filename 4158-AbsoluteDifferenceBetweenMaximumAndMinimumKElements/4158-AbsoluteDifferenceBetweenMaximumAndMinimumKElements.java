// Last updated: 2/5/2026, 10:17:37 AM
class Solution {
    public int absDifference(int[] nums, int k) {
               Arrays.sort(nums);

        int n = nums.length;
        int sumSmallest = 0;
        int sumLargest = 0;

    
        for (int i = 0; i < k; i++) {
            sumSmallest += nums[i];
        }

        
        for (int i = n - k; i < n; i++) {
            sumLargest += nums[i];
        }

        
        return Math.abs(sumLargest - sumSmallest);
    }

}
