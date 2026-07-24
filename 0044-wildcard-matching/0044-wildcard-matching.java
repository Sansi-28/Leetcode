class Solution {
  int [][] dp;
    public boolean isMatch(String s, String p) {
      dp = new int [s.length() + 1][p.length() + 1];

      int n = s.length();

      for(int i = 0; i < n; i++){
        Arrays.fill(dp[i], -1);
      }
        return f(s, p, 0, 0);
    }

    private boolean f(String s, String p, int i, int j){
      int n = s.length(), m = p.length();

      if(i >= n && j >= m) return true;

      if(i >= n){
        for(int k = j; k < m; k++){
          if(p.charAt(k) != '*') return false;
        }
        return true;
      }

      if(j >= m) return false;
      if(dp[i][j] != -1){
        if(dp[i][j] == 0) return false;
        return true;
      }

      if(p.charAt(j) == '*'){
        boolean left = f(s, p, i, j+1);
        boolean right = f(s, p, i+1, j); 
        if(left || right){dp[i][j] = 1;}else {dp[i][j] = 0;} return left|| right;
      }else{
        if(p.charAt(j) != '?' && p.charAt(j) != s.charAt(i)){
          dp[i][j] = 0;
          return false;
        }else{
          if( f(s, p, i+1, j+1)){dp[i][j] = 1; return true;}else{dp[i][j] = 0; return false;}
        }
      }
    }
}