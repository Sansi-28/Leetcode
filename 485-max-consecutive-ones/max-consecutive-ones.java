class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int count = 0;
        int max = Integer.MIN_VALUE;

        for(int e : nums){
            if(e != 1){
                count = 0;
            }else{
                count++;
            }

            max = (max > count) ? max : count;
        }

        return max;
        
    }
}