class Solution {
    public long minimumTime(int[] d, int[] r) {
        long req1 = threshold(d[0], r[0]);
        long req2 = threshold(d[1], r[1]);
        long lcm = findLCM(r[0], r[1]);
        long req3 = threshold(d[0] + d[1], lcm);

        return Math.max(req1, Math.max(req2, req3));
    }

    
    private long threshold(long d, long r) {
        if (d == 0) return 0;
        return d + (d - 1) / (r - 1);
    }

    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int findLCM(int a, int b) {
        if (a == 0 || b == 0) return 0;
        return (a / findGCD(a, b)) * b;
    }
}