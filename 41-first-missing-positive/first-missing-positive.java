class Solution {
    public int firstMissingPositive(int[] nums) {

        int n = nums.length;

        Set<Integer> set = new HashSet<>();

        for(int e : nums){
            if(e > 0){
                set.add(e);
            }
        }

        for(int i = 1; i <= n; i++){
            if(!set.contains(i)){
                return i;
            }
        }

        return nums.length + 1;


        
    }
}