// Last updated: 7/17/2026, 11:57:34 PM
class Solution {
    public boolean isHappy(int n) {
        while (n != 1 && n != 4) {
            int sum = 0;
            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }
            n = sum;
        }
        return n == 1;
    }
}