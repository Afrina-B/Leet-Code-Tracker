// Last updated: 7/17/2026, 11:56:01 PM
class Solution {
    public double mincostToHireWorkers(int[] quality, int[] wage, int k) {
        int n = quality.length;

        double[][] workers = new double[n][2];

        for (int i = 0; i < n; i++) {
            workers[i][0] = (double) wage[i] / quality[i];
            workers[i][1] = quality[i];
        }

        Arrays.sort(workers, (a, b) -> Double.compare(a[0], b[0]));

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        int qualitySum = 0;
        double ans = Double.MAX_VALUE;

        for (double[] worker : workers) {
            qualitySum += (int) worker[1];
            pq.offer((int) worker[1]);

            if (pq.size() > k) {
                qualitySum -= pq.poll();
            }

            if (pq.size() == k) {
                ans = Math.min(ans, qualitySum * worker[0]);
            }
        }

        return ans;
    }
}