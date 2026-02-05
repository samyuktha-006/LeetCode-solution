// Last updated: 2/5/2026, 10:17:47 AM
class Solution {
    public int accountBalanceAfterPurchase(int PA) {
        if(PA%10<=4) return 100-(PA/10)*10;
        else return 100-((PA/10)+1)*10;
    }
}