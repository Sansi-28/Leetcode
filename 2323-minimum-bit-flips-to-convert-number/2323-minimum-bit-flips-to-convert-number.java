class Solution {
    public int minBitFlips(int start, int goal) {
     int ones = Integer.bitCount(start^goal);
     return ones;   
    }
}