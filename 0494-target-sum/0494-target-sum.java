class Solution {
    public int findTargetSumWays(int[] nums, int target) {
       return f(nums, target, 0); 
    }

    private int f(int [] nums, int target, int i){
      int n = nums.length;
      if(target == 0 && i >= n)return 1;
      if(i >= n)return 0;

      int plus = f(nums, target - nums[i], i+1);
      int sub = f(nums, target + nums[i], i+1);

      return plus + sub;
    }
}