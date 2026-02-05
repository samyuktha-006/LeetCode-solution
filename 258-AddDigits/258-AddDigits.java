// Last updated: 2/5/2026, 10:19:07 AM
class Solution {
    public int addDigits(int num) {
       if (num == 0) return 0;
        return 1 + (num - 1) % 9;

    }
}