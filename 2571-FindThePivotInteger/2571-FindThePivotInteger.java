// Last updated: 2/5/2026, 10:18:10 AM
class Solution {
    public int pivotInteger(int n) {
        int total=(n*(n+1))/2;
        int s=(int)Math.sqrt(total);
        if((s*s)==total) return s;
        else return -1;
    }
}