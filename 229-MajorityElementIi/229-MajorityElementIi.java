// Last updated: 7/17/2026, 11:57:15 PM
import java.util.*;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int c1 = 0, c2 = 0;
        Integer n1 = null, n2 = null;

        for (int num : nums) {
            if (n1 != null && num == n1)
                c1++;
            else if (n2 != null && num == n2)
                c2++;
            else if (c1 == 0) {
                n1 = num;
                c1 = 1;
            } else if (c2 == 0) {
                n2 = num;
                c2 = 1;
            } else {
                c1--;
                c2--;
            }
        }

        c1 = c2 = 0;
        for (int num : nums) {
            if (n1 != null && num == n1) c1++;
            else if (n2 != null && num == n2) c2++;
        }

        List<Integer> ans = new ArrayList<>();
        if (c1 > nums.length / 3) ans.add(n1);
        if (c2 > nums.length / 3) ans.add(n2);

        return ans;
    }
}