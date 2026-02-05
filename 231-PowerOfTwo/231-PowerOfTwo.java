// Last updated: 2/5/2026, 10:19:10 AM
class Solution {
    public boolean isPowerOfTwo(int n) {
        return (n>0 &&((n&(n-1))==0));
    }
}