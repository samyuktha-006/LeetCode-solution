// Last updated: 2/5/2026, 10:19:17 AM
class Solution {
    public int trailingZeroes(int n) {
        int count = 0;
        while (n > 0) {
            n /= 5;       
            count += n;
        }
        return count;


    }
}