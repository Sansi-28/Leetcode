class Solution {
    public int splitArray(int[] nums, int k) {
        
        int left = Integer.MIN_VALUE,  right = 0;

        for(int e : nums){
            left = Math.max(left, e);
            right += e;
        }
        while(left < right){
            int mid = left + (right - left) / 2;

            if(canDo(nums, k, mid)){
                right = mid;
            }else{
                left = mid+1;
            }
        }
        return left;
    }



    boolean canDo(int[] nums, int k, int min){

        int sum = 0, splits = 1;
        for(int e : nums){
            if(sum + e > min){
                splits++;
                sum = e;
            }else{
                sum += e;
            }
        }

        return splits <= k;
    }
}