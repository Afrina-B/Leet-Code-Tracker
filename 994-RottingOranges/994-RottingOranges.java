// Last updated: 7/18/2026, 12:03:19 AM
1class Solution {
2    public int orangesRotting(int[][] grid) {
3        Queue<int[]> queue = new LinkedList<>();
4        int fresh = 0;
5        int time = 0;
6
7        for (int i = 0; i < grid.length; i++) {
8            for (int j = 0; j < grid[0].length; j++) {
9                if (grid[i][j] == 2) {
10                    queue.offer(new int[]{i, j});
11                } else if (grid[i][j] == 1) {
12                    fresh++;
13                }
14            }
15        }
16
17        int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
18
19        while (!queue.isEmpty() && fresh > 0) {
20            int size = queue.size();
21
22            for (int i = 0; i < size; i++) {
23                int[] cur = queue.poll();
24
25                for (int[] d : dir) {
26                    int x = cur[0] + d[0];
27                    int y = cur[1] + d[1];
28
29                    if (x >= 0 && x < grid.length && y >= 0 && y < grid[0].length && grid[x][y] == 1) {
30                        grid[x][y] = 2;
31                        fresh--;
32                        queue.offer(new int[]{x, y});
33                    }
34                }
35            }
36
37            time++;
38        }
39
40        return fresh == 0 ? time : -1;
41    }
42}