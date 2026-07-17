// Last updated: 7/17/2026, 11:54:48 PM
import java.util.*;

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer, Long> map = new HashMap<>();
        long prefix = 0;
        long ans = Long.MIN_VALUE;

        for (int num : nums) {
            map.putIfAbsent(num, prefix);
            prefix += num;

            if (map.containsKey(num - k))
                ans = Math.max(ans, prefix - map.get(num - k));

            if (map.containsKey(num + k))
                ans = Math.max(ans, prefix - map.get(num + k));

            map.put(num, Math.min(map.get(num), prefix - num));
        }

        return ans == Long.MIN_VALUE ? 0 : ans;
    }
}