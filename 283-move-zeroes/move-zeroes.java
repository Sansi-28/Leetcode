class Solution {
    public void moveZeroes(int[] nums) {

        int slow = 0, fast = 0;

        while(slow < nums.length && fast < nums.length){
            if(nums[slow] != 0){
                slow++;
            }else{
                if(nums[fast] != 0 && fast > slow){
                    swap(nums, slow, fast);
                    
                }
                fast++;
            }

            

        }

        
        
    }

    private void swap(int [] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}