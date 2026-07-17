// Last updated: 7/17/2026, 11:54:16 PM
import java.util.*;

class Solution {
    public int maximumSetSize(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();

        for (int x : nums1) s1.add(x);
        for (int x : nums2) s2.add(x);

        int limit = nums1.length / 2;

        Set<Integer> common = new HashSet<>(s1);
        common.retainAll(s2);

        int only1 = s1.size() - common.size();
        int only2 = s2.size() - common.size();

        int take1 = Math.min(only1, limit);
        int take2 = Math.min(only2, limit);

        int remain1 = limit - take1;
        int remain2 = limit - take2;

        return take1 + take2 + Math.min(common.size(), remain1 + remain2);
    }
}