class Solution {
    int[][] dp;
    int sum;

    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;
        sum = 0;
        for (int num : nums) sum += num;

        if (Math.abs(target) > sum) return 0;

        dp = new int[n + 1][2 * sum + 1];
        for (int i = 0; i < n + 1; i++) {
            Arrays.fill(dp[i], -2);
        }
        return f(nums, target, 0);
    }

    private int f(int[] nums, int target, int i) {
        int n = nums.length;

        if (i >= n) {
            return (target == 0) ? 1 : 0;
        }

        if (target > sum || target < -sum) return 0;

        int idx = target + sum;
        if (dp[i][idx] != -2) {
            return dp[i][idx];
        }

        int plus = f(nums, target - nums[i], i + 1);
        int sub = f(nums, target + nums[i], i + 1);

        dp[i][idx] = plus + sub;
        return dp[i][idx];
    }
}