class Solution {
    public int longestOnes(int[] nums, int k) {
        int i = 0, j = 0;
        int count = 0;
        int max = 0;
        int n = nums.length;

        while (j < n) {
            if (nums[j] == 0) count++;

            if (count > k) {         
                if (nums[i] == 0) count--;
                i++;
            }

            max = Math.max(max, j - i + 1);
            j++;
        }

        return max;
    }
}