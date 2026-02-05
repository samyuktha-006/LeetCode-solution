// Last updated: 2/5/2026, 10:19:41 AM
class Solution {
    public boolean isPalindrome(int x) {
      if(x<0) return false;
      int rev=0,org=x;
      while(x!=0){
        rev=rev*10 +x%10;
        x/=10;
      }  
      return org==rev?true:false;
    }
}