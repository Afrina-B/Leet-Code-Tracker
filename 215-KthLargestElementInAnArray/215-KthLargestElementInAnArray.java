// Last updated: 7/17/2026, 11:57:30 PM
class Solution {
    public int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int num : nums) {

            pq.offer(num);

            if (pq.size() > k)
                pq.poll();
        }

        return pq.peek();
    }
}