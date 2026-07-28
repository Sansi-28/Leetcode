class Solution {
    public int jump(int[] nums) {
       
       int left = 0,right = 0, count = 0;
       int n = nums.length;

       while(right < n-1){
        int newright = right;
        for(int i = left; i <= right && i < n; i++){
          //if(left == n-1 || right >= n-1)break;
          
          newright = Math.max(i+nums[i], newright);
        }
        right = newright;
        count++;
        left++;
       }
      return count;
    }
}