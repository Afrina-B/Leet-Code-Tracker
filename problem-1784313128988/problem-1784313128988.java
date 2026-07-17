// Last updated: 7/18/2026, 12:02:08 AM
1class Solution {
2    public int[] dailyTemperatures(int[] temperatures) {
3        int n = temperatures.length;
4        int[] ans = new int[n];
5        Stack<Integer> stack = new Stack<>();
6
7        for (int i = n - 1; i >= 0; i--) {
8            while (!stack.isEmpty() && temperatures[stack.peek()] <= temperatures[i]) {
9                stack.pop();
10            }
11
12            if (!stack.isEmpty()) {
13                ans[i] = stack.peek() - i;
14            }
15
16            stack.push(i);
17        }
18
19        return ans;
20    }
21}