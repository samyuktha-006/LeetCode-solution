// Last updated: 2/5/2026, 10:17:40 AM
class Solution {
    public boolean canAliceWin(int[] nums) {
        int sd =0,dd=0;
        for(int x:nums){
            if(x<10) sd+=x;
            else dd+=x;
        }
        return sd!=dd;
 
    }
}