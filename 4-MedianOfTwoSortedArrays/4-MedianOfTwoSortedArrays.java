// Last updated: 7/17/2026, 11:58:45 PM
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length)
            return findMedianSortedArrays(nums2, nums1);

        int m = nums1.length, n = nums2.length;
        int low = 0, high = m;

        while (low <= high) {
            int px = (low + high) / 2;
            int py = (m + n + 1) / 2 - px;

            int maxLeftX = (px == 0) ? Integer.MIN_VALUE : nums1[px - 1];
            int minRightX = (px == m) ? Integer.MAX_VALUE : nums1[px];

            int maxLeftY = (py == 0) ? Integer.MIN_VALUE : nums2[py - 1];
            int minRightY = (py == n) ? Integer.MAX_VALUE : nums2[py];

            if (maxLeftX <= minRightY && maxLeftY <= minRightX) {
                if ((m + n) % 2 == 0)
                    return (Math.max(maxLeftX, maxLeftY) +
                            Math.min(minRightX, minRightY)) / 2.0;
                return Math.max(maxLeftX, maxLeftY);
            } else if (maxLeftX > minRightY) {
                high = px - 1;
            } else {
                low = px + 1;
            }
        }
        return 0;
    }
}