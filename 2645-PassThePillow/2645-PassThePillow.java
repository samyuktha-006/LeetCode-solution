// Last updated: 2/5/2026, 10:18:02 AM
class Solution {
    public int passThePillow(int n, int time) {
        int cycle=time/(n-1);
        int rem=time%(n-1);
        if(cycle%2==1){
            return n-rem;
        }else{
            return rem+1;
        }
    }
}