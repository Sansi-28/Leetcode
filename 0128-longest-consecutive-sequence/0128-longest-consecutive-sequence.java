class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer, Boolean> map = new HashMap<>();

        for(int e : nums){
            map.put(e, false);
        }

        int n = nums.length;

        int max = 0;

        for(int i = 0; i < n; i++){
           
            int ind = nums[i];
            int count = 1;
            while(map.containsKey(ind-1) && !map.get(ind - 1)){
                if(map.containsKey(ind-1)){
                    count++;
                    map.put(ind-1, true);
                }
                ind--;
            }
            ind = nums[i];
            while(map.containsKey(ind +1) && !map.get(ind + 1)){
                if(map.containsKey(ind+1)){
                    count++;
                    map.put(ind+1, true);
                }
                ind++;
            }
            max  = Math.max(max, count);
        }

        return max;
    }
}