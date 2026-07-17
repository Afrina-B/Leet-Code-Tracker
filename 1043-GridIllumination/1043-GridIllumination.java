// Last updated: 7/17/2026, 11:55:54 PM
import java.util.*;

class Solution {
    public int[] gridIllumination(int n, int[][] lamps, int[][] queries) {
        Map<Integer, Integer> row = new HashMap<>();
        Map<Integer, Integer> col = new HashMap<>();
        Map<Integer, Integer> diag = new HashMap<>();
        Map<Integer, Integer> anti = new HashMap<>();
        Set<Long> set = new HashSet<>();

        for (int[] l : lamps) {
            long key = ((long) l[0] << 32) | (l[1] & 0xffffffffL);
            if (set.add(key)) {
                row.put(l[0], row.getOrDefault(l[0], 0) + 1);
                col.put(l[1], col.getOrDefault(l[1], 0) + 1);
                diag.put(l[0] - l[1], diag.getOrDefault(l[0] - l[1], 0) + 1);
                anti.put(l[0] + l[1], anti.getOrDefault(l[0] + l[1], 0) + 1);
            }
        }

        int[] ans = new int[queries.length];
        int[] d = {-1, 0, 1};

        for (int i = 0; i < queries.length; i++) {
            int x = queries[i][0];
            int y = queries[i][1];

            ans[i] = (row.getOrDefault(x, 0) > 0 ||
                      col.getOrDefault(y, 0) > 0 ||
                      diag.getOrDefault(x - y, 0) > 0 ||
                      anti.getOrDefault(x + y, 0) > 0) ? 1 : 0;

            for (int dx : d) {
                for (int dy : d) {
                    int nx = x + dx;
                    int ny = y + dy;
                    long key = ((long) nx << 32) | (ny & 0xffffffffL);

                    if (set.remove(key)) {
                        row.put(nx, row.get(nx) - 1);
                        col.put(ny, col.get(ny) - 1);
                        diag.put(nx - ny, diag.get(nx - ny) - 1);
                        anti.put(nx + ny, anti.get(nx + ny) - 1);
                    }
                }
            }
        }

        return ans;
    }
}