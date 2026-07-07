class Solution {
  int[][] dp;
    public int uniquePaths(int m, int n) {
      dp = new int[m+1][n+1];

      for(int i = 0; i < m+1; i++){
        Arrays.fill(dp[i], -1);
      }
      
        return f(m, n, 0, 0);

    }

    private int f(int m, int n, int i, int j){

      if(m <= i || n <= j)return 0;

      if(m-1 == i && n-1 == j){
        return 1;
      }

      if(dp[i][j] != -1)return dp[i][j];

      dp[i][j] = f(m, n, i, j+1) + f(m, n, i+1, j);

      return dp[i][j];
    }
}