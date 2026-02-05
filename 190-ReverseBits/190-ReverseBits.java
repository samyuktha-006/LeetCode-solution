// Last updated: 2/5/2026, 10:19:16 AM
class Solution {
    public int reverseBits(int n) {
        int a=0;
        for(int i=0;i<32;i++){
            a<<=1;
            a=(a|(n&1));
            n>>=1;
        } 
        return a;
    }
}