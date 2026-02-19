public class Solution {
    public int repeatedStringMatch(String a, String b) {
        int n = a.length();
        int m = b.length();

        int repeats = (m + n - 1) / n;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < repeats; i++) sb.append(a);

        if (kmp(sb.toString(), b)) return repeats;
        sb.append(a);
        if (kmp(sb.toString(), b)) return repeats + 1;
        sb.append(a);
        if (kmp(sb.toString(), b)) return repeats + 2;

        return -1;
    }

    private boolean kmp(String text, String pattern) {
        int n = text.length(), m = pattern.length();
        if (m == 0) return true;
        int[] lps = buildLPS(pattern);
        int i = 0, j = 0;
        while (i < n) {
            if (text.charAt(i) == pattern.charAt(j)) {
                i++; j++;
                if (j == m) return true;
            } else {
                if (j != 0) j = lps[j - 1];
                else i++;
            }
        }
        return false;
    }

    private int[] buildLPS(String pat) {
        int m = pat.length();
        int[] lps = new int[m];
        int len = 0;
        int i = 1;
        while (i < m) {
            if (pat.charAt(i) == pat.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }
}
