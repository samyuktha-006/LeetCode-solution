// Last updated: 2/5/2026, 10:18:07 AM
class Solution {
    public int countDigits(int num) {
         int count = 0;
        String s = String.valueOf(num);
        
        for (char c : s.toCharArray()) {
            int digit = c - '0';   
            if (num % digit == 0) {
                count++;
            }
        }
        
        return count;


    }
}