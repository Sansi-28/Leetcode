class Solution {

  int [][] dp;

    public int change(int amount, int[] coins) {
      int n = coins.length;
      dp = new int[n+1][amount+1];
      for(int i = 0; i < n; i++){
        Arrays.fill(dp[i], -1);
      }
        return f(amount, coins, 0);
    }

    private int f(int amount, int[] coins, int i){
      int n = coins.length;
      if(amount == 0 && i == n)return 1;
      if(amount < 0)return 0;
      if(i >= n)return 0;

      if(dp[i][amount] != -1){
        return dp[i][amount];
      } 

      int left = f(amount-coins[i], coins, i);
      int right = f(amount, coins, i+1);

      dp[i][amount]  = left + right;
      return dp[i][amount];
    }
}