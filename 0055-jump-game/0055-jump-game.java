class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length-1;
        if(nums.length == 1)return true;
        boolean result = false;
        for(int i=n-1;i>=0;i--){

            if(nums[i] >= n-i){
                n = i;
                if(i == 0){
                    result = true;
                }
            }


        }
        return result;

    }
}