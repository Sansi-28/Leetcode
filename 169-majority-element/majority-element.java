class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int n = nums.length;
        int ele = 0;
        for(int i = 0; i < n; i++){
            if(count == 0){
                ele = nums[i];
                count++;
            }else{
                if(ele != nums[i]){
                    count--;
                }else{
                    count++;
                }
            }
        }

        int ans = 0;

        for(int i = 0; i < n; i++){
            if(ele == nums[i])ans++;
        }

        if(ans > n/2){
            return ele;
        }else return 0;
    }
}