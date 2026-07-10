class Solution {
  int [] [] dp;
    public int coinChange(int[] coins, int amount) {
      int n = coins.length;
      dp = new int [n+1][amount+1];

      for(int i = 0; i < n+1; i++){
        Arrays.fill(dp[i], -1);
      }
        int ans = f(coins, amount, 0);
        if(ans >= 100000)return -1;
        return ans;
    }

    private int f(int [] coins, int amount, int i){
       int n = coins.length;
       if(amount == 0)return 0;
       if(i >= n || amount < 0)return 100000;

       if(dp[i][amount] != -1)return dp[i][amount];

       int left = 1 + f(coins, amount - coins[i], i);
       int right = 1 + f(coins, amount - coins[i], i+1);
       int other = f(coins, amount, i+1);

       dp[i][amount] = Math.min(left, Math.min(right, other));

       return dp[i][amount];
    }
}