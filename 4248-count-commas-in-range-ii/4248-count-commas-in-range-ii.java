class Solution {
    public long countCommas(long n) {

        int len = Long.toString(n).length();
        long ans = 0;

        for (int i = 3; i < len; i += 3) {

            long lower = pow(10, i);
            long upper = pow(10, i + 3) - 1;

            if (n < lower) {
                break;
            }

            long limit = Math.min(n, upper);

            long count = limit - lower + 1;

            ans += (long) (i / 3) * count;
        }

        return ans;
    }

    private long pow(int base, int e) {
        long result = 1;

        for (int i = 0; i < e; i++) {
            result *= base;
        }

        return result;
    }
}