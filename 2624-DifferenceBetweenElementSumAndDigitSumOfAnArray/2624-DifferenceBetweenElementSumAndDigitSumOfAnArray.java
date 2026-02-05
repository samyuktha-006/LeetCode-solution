// Last updated: 2/5/2026, 10:18:05 AM
class Solution {
    public int differenceOfSum(int[] nums) {
        int elementSum = 0, digitSum = 0;
        for (int num : nums) {
            elementSum += num;
            for (int x = num; x > 0; x /= 10) digitSum += x % 10;
        }
        return Math.abs(elementSum - digitSum);


    }
}