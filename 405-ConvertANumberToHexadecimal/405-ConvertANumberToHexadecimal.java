// Last updated: 2/5/2026, 10:18:54 AM
class Solution {
    public String toHex(int num) {
        if (num == 0) return "0";
        char[] hexChars = "0123456789abcdef".toCharArray();
        StringBuilder sb = new StringBuilder();
        
        while (num != 0) {
            int hexDigit = num & 0xf; 
            sb.append(hexChars[hexDigit]);
            num >>>= 4; 
        }
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        System.out.println(sol.toHex(26));   
        System.out.println(sol.toHex(-1));  
        System.out.println(sol.toHex(0));    
        System.out.println(sol.toHex(255));
 
    }
}