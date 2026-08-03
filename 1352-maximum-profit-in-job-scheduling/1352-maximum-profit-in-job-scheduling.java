class Solution {
    int[] memo;
    int[][] jobs;

    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int n = startTime.length;
        jobs = new int[n][3];
        for (int i = 0; i < n; i++) {
            jobs[i][0] = startTime[i];
            jobs[i][1] = endTime[i];
            jobs[i][2] = profit[i];
        }
        Arrays.sort(jobs, (a, b) -> Integer.compare(a[1], b[1]));

        memo = new int[n];
        Arrays.fill(memo, -1);
        return f(n - 1);
    }

    private int f(int i) {
        if (i < 0) return 0;
        if (memo[i] != -1) return memo[i];

        int skip = f(i - 1);
        int prevIndex = findPrev(jobs[i][0], i - 1);
        int take = jobs[i][2] + f(prevIndex);

        return memo[i] = Math.max(skip, take);
    }

    private int findPrev(int startTime, int upTo) {
        int lo = 0, hi = upTo, ans = -1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (jobs[mid][1] <= startTime) { ans = mid; lo = mid + 1; }
            else hi = mid - 1;
        }
        return ans;
    }
}