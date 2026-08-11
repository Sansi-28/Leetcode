import java.util.*;

class Solution {
    class Pair {
        int x;
        int y;
        int distance;
        Pair(int x, int y, int distance) {
            this.x = x;
            this.y = y;
            this.distance = distance;
        }
    }

    public int minimumEffortPath(int[][] heights) {
        int m = heights.length;
        int n = heights[0].length;
        if (m == 1 && n == 1) return 0;

        PriorityQueue<Pair> minHeap = new PriorityQueue<>((a, b) -> a.distance - b.distance);

        int[][] dist = new int[m][n];
        for (int i = 0; i < m; i++) {
            Arrays.fill(dist[i], (int)1e9);
        }

        int[] dirX = {0, 0, -1, 1};
        int[] dirY = {1, -1, 0, 0};

        dist[0][0] = 0;
        minHeap.offer(new Pair(0, 0, 0));

        while (!minHeap.isEmpty()) {
            Pair node = minHeap.poll();
            if (node.distance != dist[node.x][node.y]) continue;

            for (int k = 0; k < 4; k++) {
                int r = node.x + dirX[k];
                int c = node.y + dirY[k];

                if (r >= 0 && r < m && c >= 0 && c < n) {
                    int edge = Math.abs(heights[node.x][node.y] - heights[r][c]);
                    int candidate = Math.max(node.distance, edge);
                    if (candidate < dist[r][c]) {
                        dist[r][c] = candidate;
                        minHeap.offer(new Pair(r, c, candidate));
                    }
                }
            }
        }

        return dist[m-1][n-1];
    }
}
