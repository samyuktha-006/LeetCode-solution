// Last updated: 2/5/2026, 10:17:49 AM
class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
      int count = 0;
        for (int h : hours) {
            if (h >= target) {
                count++;
            }
        }
        return count;
  
    }
}