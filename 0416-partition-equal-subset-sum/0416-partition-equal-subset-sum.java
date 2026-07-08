class Solution {

int[][] dp;

    public boolean canPartition(int[] nums) {



      int sum = 0;

      for(int e : nums){
        sum+= e;
      }

      if(sum % 2 != 0)return false;

      int n = nums.length;

      dp = new int[n+1][sum/2 + 1];

      for(int i = 0; i < n+1; i++){
        Arrays.fill(dp[i], -1);
      }
      return f(nums, 0, sum/2);
        
    }

    private boolean f(int [] nums, int i, int target){
      int n = nums.length;
      if(n <= i || target < 0)return false;

      if(target == 0)return true;

      if(dp[i][target] != -1){
        if(dp[i][target] == 0)return false;
        else return true;

      } 

      boolean pick = f(nums, i+1, target - nums[i]);
      boolean notpick = f(nums, i+1, target);

      if(pick||notpick){
        dp[i][target] = 1;
      }else{
        dp[i][target] = 0;
      }
      return pick||notpick;
    }
}