class Solution {
    public int longestConsecutive(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        int n = nums.length;

        for(int i = 0; i < n; i++){
            map.put(nums[i], 0);
        }

        int max = 0;

        for(int i = 0; i < n; i++){
            Stack<Integer> st = new Stack<>();
            int j = 0, val = 0;
            while(map.containsKey(nums[i] - j)){
                if(map.get(nums[i] - j) == 0){
                    st.push(nums[i] - j);
                }else{
                    val = map.get(nums[i] - j);
                    break;
                }
                j++;
            }

            while(!st.isEmpty()){
                map.put(st.pop(), val+1);
                max = Math.max(max, val+1);
                val++;
            }
            
        }
        
        return max;
    }
}