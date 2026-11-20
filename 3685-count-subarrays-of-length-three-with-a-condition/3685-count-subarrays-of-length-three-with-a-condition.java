class Solution {
    public int countSubarrays(int[] nums) {
        int first, sec, third, count = 0;
        for(int i = 0; i < nums.length-2; i++){
             first = nums[i];
             sec = nums[i+1];
             third = nums[i+2];
             if(2*(first + third) == sec) count++;

        }
        return count;
    }
}