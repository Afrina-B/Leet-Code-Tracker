// Last updated: 7/17/2026, 11:57:55 PM
class Solution {
    public int singleNumber(int[] nums) {
    int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
}
}