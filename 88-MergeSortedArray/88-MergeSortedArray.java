// Last updated: 7/17/2026, 11:58:14 PM
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        for(int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }

        Arrays.sort(nums1);
    }
}