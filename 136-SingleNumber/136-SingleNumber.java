// Last updated: 2/5/2026, 10:19:23 AM
class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num; 
        }
        return result;


    }
}