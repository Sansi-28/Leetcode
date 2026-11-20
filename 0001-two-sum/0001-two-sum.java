class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        int[] ans = new int[2];
        for(int i = 0; i < n; i++){
            int req = target - nums[i];
           
            if((!map.isEmpty() && map.containsKey(req)) ){
                if(!map.isEmpty()){ans[0] = map.get(req);
                ans[1] = i;}
            }
            map.put(nums[i], i);
        }
        return ans;
    }
}