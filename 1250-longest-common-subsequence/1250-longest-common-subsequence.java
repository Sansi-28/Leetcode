class Solution {
  int[][] dp;

    public int longestCommonSubsequence(String text1, String text2) {
      int n = text1.length(), m = text2.length();
      dp = new int [text1.length()+1][text2.length()+1];

      for(int i=0; i<n; i++){
        Arrays.fill(dp[i], -1);
      }
      return f(text1, text2, text1.length()-1, text2.length()-1);
    }

    private int f(String t1, String t2, int i1, int i2){
      if(i1 < 0 || i2 < 0)return 0;

      if(dp[i1][i2] != -1)return dp[i1][i2];

      char c1 = t1.charAt(i1), c2 = t2.charAt(i2);
      if(c1 == c2){
        dp[i1][i2] = 1+ f(t1, t2, i1 -1, i2 - 1);
        return dp[i1][i2];
      }
      dp[i1][i2] = Math.max(f(t1, t2, i1, i2 -1), f(t1, t2, i1 - 1, i2));
      return dp[i1][i2];
    }
}