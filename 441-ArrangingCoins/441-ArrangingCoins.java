// Last updated: 2/5/2026, 10:18:53 AM
class Solution {
    public int arrangeCoins(int n) {
        int row =1;
        while(n>=row){
            n-=row;
            row++;
        }
        return row-1;
    }
}