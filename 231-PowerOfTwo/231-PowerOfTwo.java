// Last updated: 7/17/2026, 11:57:12 PM
class Solution {
    public boolean isPowerOfTwo(int n) {
             return n > 0 && (n & (n - 1)) == 0;

    }
}