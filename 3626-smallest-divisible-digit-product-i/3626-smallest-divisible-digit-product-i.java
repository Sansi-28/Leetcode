class Solution {
    public int smallestNumber(int n, int t) {
        for(int i = n; i < n + 10; i ++){
          String s = Integer.toString(i);
          int prod = 1;
          for(int j = 0; j < s.length(); j++){
            prod *= (int)(s.charAt(j) - '0');
          }

          if(prod%t == 0)return i;

        }

        return 0;
    }
}