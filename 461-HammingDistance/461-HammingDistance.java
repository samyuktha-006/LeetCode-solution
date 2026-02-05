// Last updated: 2/5/2026, 10:18:52 AM
class Solution {
    public int hammingDistance(int x, int y) {
        int xor = x ^ y;
        int count = 0;
        while (xor != 0) {
            count += xor & 1;  
            xor >>= 1;         
        }
        
        return count;

 
    }
}