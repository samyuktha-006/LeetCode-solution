// Last updated: 2/5/2026, 10:18:13 AM
class Solution {
    public int averageValue(int[] nums) {
       int sum = 0;
        int count = 0;
        
        for (int num : nums) {
            if (num % 2 == 0 && num % 3 == 0) {
                sum += num;
                count++;
            }
        }
        
        return count == 0 ? 0 : sum / count;

  
    }
}