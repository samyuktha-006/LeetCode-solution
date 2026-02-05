// Last updated: 2/5/2026, 10:19:27 AM
class Solution {
    public int maxProfit(int[] prices) {
       int minPrice = Integer.MAX_VALUE;  
        int maxProfit = 0;                

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;          
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;  
            }
        }
        return maxProfit;
 
    }
}