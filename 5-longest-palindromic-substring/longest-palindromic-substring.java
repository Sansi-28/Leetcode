/*class Solution {
    public String longestPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        StringBuilder max = new StringBuilder();
        StringBuilder[][] memo = new StringBuilder[s.length()][s.length()];
        helper(s, 0, 0, sb, max, memo);
        return max.toString();
    }

    private void helper(String s, int st, int indx, StringBuilder curr, StringBuilder max, StringBuilder[][] memo) {
        if (indx == s.length()) return;

        // Memoization check
        if (memo[st][indx] != null) {
            if (memo[st][indx].length() > max.length()) {
                max.setLength(0);
                max.append(memo[st][indx]);
            }
            return;
        }

        curr.append(s.charAt(indx));
        String currStr = curr.toString();

        if (curr.length() > max.length() && isPalindrome(currStr)) {
            max.setLength(0);
            max.append(currStr);
        }

        helper(s, st, indx + 1, curr, max, memo);

        
        memo[st][indx] = new StringBuilder(max);

        curr.deleteCharAt(curr.length() - 1);

        
        if (curr.length() == 0) {
            helper(s, indx + 1, indx + 1, curr, max, memo);
        }
    }

    public static boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l++) != s.charAt(r--)) return false;
        }
        return true;
    }
}
*/

class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0, end = 0;

        for (int i = 0; i < s.length(); i++) {
            int len1 = expand(s, i, i);       // Odd-length palindromes
            int len2 = expand(s, i, i + 1);   // Even-length palindromes 
            int len = Math.max(len1, len2);

            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    private int expand(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}
