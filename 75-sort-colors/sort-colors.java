class Solution {
    public void sortColors(int[] nums) {

        int n = nums.length;

        for(int i = 0; i < n; i ++){
            for(int j = i; j < n; j++ ){
                if(nums[i] > nums[j]){
                    swap(nums, i, j);
                }
            }
        }

       
        
    }

    private void swap(int [] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}