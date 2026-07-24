class Solution {
  int[][] dp;
    public int minDistance(String word1, String word2) {
      int n = word1.length(), m = word2.length();
      dp = new int[n+1][m+1];

      for(int i = 0; i < n+1; i++){
        Arrays.fill(dp[i], -1);
      }
        return f(word1, word2, word1.length()-1, word2.length()-1);
    }

    private int f(String w1, String w2, int i, int j){

      if(i < 0 && j < 0){
         return 0;
      }else if(j < 0){
        return i + 1;  
      }else if(i < 0){
        return j + 1; 
      }

      if(dp[i][j] != -1)return dp[i][j];

      if(w1.charAt(i) == w2.charAt(j)){
        return f(w1, w2, i-1, j-1);
      }

      int ins = 1 + f(w1, w2, i, j-1);
      int del = 1 + f(w1, w2, i-1, j);
      int rep = 1 + f(w1, w2, i-1, j-1);

      dp[i][j] =  Math.min(ins, Math.min(del, rep));
      return dp[i][j];
    }
}