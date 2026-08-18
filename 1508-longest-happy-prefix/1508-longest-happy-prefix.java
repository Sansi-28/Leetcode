class Solution {
    public String longestPrefix(String s) {
        int n = s.length();

        int[] lcs  = new int[n];

        int len = 0;

        for(int i = 1; i < n; i++){
            while(len > 0 && s.charAt(i) != s.charAt(len)) len = lcs[len-1];
            if(s.charAt(i) == s.charAt(len))len++;
            lcs[i] = len;
        }

        return s.substring(0, lcs[n-1]);
    }
}