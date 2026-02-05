// Last updated: 2/5/2026, 10:19:42 AM
class Solution {
    public int reverse(int x) {
        long rev=0;
        while(x!=0){
            rev= rev*10 + x%10;
            x=x/10;
        }
        if(rev > Integer.MAX_VALUE || rev< Integer.MIN_VALUE){
            return 0;
        }
        return (int)rev;
    }
}