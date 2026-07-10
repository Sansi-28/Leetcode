class Solution {
    public int findContentChildren(int[] g, int[] s) {

      Arrays.sort(s);
      Arrays.sort(g);

      int n = g.length, m = s.length;

      int i = 0;
      int j = 0;
      int count = 0;

      while(i < n && j < m){
        if( s[j] >= g[i]){
          count++;
          i++;
        }

        j++; 
      }

      return count;
        
    }
}