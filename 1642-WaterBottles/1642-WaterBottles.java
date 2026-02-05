// Last updated: 2/5/2026, 10:18:29 AM
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int drank = numBottles;   // start by drinking all initial bottles
        int empty = numBottles;   // all become empty

        while (empty >= numExchange) {
            int newBottles = empty / numExchange;   // how many new full bottles we get
            drank += newBottles;                    // drink them
            empty = empty % numExchange + newBottles; // leftover empties + new empties
        }

        return drank;


    }
}