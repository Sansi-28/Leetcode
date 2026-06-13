class Solution {
    public List<String> ans;
    public List<String> generateParenthesis(int n) {
        ans = new ArrayList<>();

        helper(n, "", 0, 0);
        return ans;
    }

    private void helper(int n, String s, int count0, int countC){
      if(s.length() == 2*n){
        ans.add(s);
        return;
      }

      if(count0 < n){
        helper(n, s+'(', count0+1, countC);
      }

      if( countC < count0){
        helper(n, s+')', count0, countC+1);
      }
    }
}