class Solution {
    public int[] rearrangeArray(int[] nums) {

        int n = nums.length, indx = 0;

        int[] res = new int [n]; 
        
        for(int i = 0; i < n; i++){
            if(nums[i] > 0){
                res[indx] = nums[i];
                indx = indx + 2;
            }
        }

        indx = 1;

        for(int i = 0; i < n; i++){
            if(nums[i] < 0){
                res[indx] = nums[i];
                indx = indx + 2;
            }
        }
        return res;



    }
}