// Last updated: 2/5/2026, 10:19:00 AM
class Solution {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) return false;
        
        while (n % 3 == 0) {
            n /= 3;
        }
        
        return n == 1;


    }
}