class Solution {
    public int[] shuffle(int[] nums, int n) {

        int indx = 0;
        int indy = 1;

        int[] ans = new int[2*n];
        
        for(int i = 0; i < 2*n; i++){
            if(i < n){
                ans[indx] = nums[i];
                indx += 2;
            }else{
                ans[indy] = nums[i];
                indy += 2;
            }
        }

        return ans;
    }
}