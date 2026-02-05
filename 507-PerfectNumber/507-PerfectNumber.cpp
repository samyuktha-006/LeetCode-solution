// Last updated: 2/5/2026, 10:18:49 AM
class Solution {
public:
    bool checkPerfectNumber(int num) {
        if (num == 1) return false;  // 1 is not a perfect number
        
        int sum = 1;  // 1 is always a divisor
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i;
                if (i != num / i) {
                    sum += num / i;
                }
            }
        }
        return sum == num;

 
    }
};