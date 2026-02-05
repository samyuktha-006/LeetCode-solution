// Last updated: 2/5/2026, 10:19:18 AM
class Solution {
    public int titleToNumber(String columnTitle) {
         int result = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            char c = columnTitle.charAt(i);
            int value = c - 'A' + 1; // Convert letter to number
            result = result * 26 + value;
        }
        return result;

    }
}