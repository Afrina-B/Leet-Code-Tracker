// Last updated: 7/18/2026, 12:03:42 AM
1import java.util.*;
2
3class Solution {
4    public List<List<Integer>> findWinners(int[][] matches) {
5        TreeMap<Integer, Integer> losses = new TreeMap<>();
6
7        for (int[] match : matches) {
8            losses.putIfAbsent(match[0], 0);
9            losses.put(match[1], losses.getOrDefault(match[1], 0) + 1);
10        }
11
12        List<Integer> zero = new ArrayList<>();
13        List<Integer> one = new ArrayList<>();
14
15        for (int player : losses.keySet()) {
16            if (losses.get(player) == 0)
17                zero.add(player);
18            else if (losses.get(player) == 1)
19                one.add(player);
20        }
21
22        List<List<Integer>> ans = new ArrayList<>();
23        ans.add(zero);
24        ans.add(one);
25
26        return ans;
27    }
28}