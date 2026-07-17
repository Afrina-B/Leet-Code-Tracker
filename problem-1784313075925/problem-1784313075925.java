// Last updated: 7/18/2026, 12:01:15 AM
1class Solution {
2    public int[] topKFrequent(int[] nums, int k) {
3        HashMap<Integer, Integer> map = new HashMap<>();
4
5        for (int num : nums) {
6            map.put(num, map.getOrDefault(num, 0) + 1);
7        }
8
9        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));
10
11        for (int key : map.keySet()) {
12            pq.offer(key);
13            if (pq.size() > k) {
14                pq.poll();
15            }
16        }
17
18        int[] ans = new int[k];
19        for (int i = k - 1; i >= 0; i--) {
20            ans[i] = pq.poll();
21        }
22
23        return ans;
24    }
25}