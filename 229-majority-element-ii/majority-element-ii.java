class Solution {
    public List<Integer> majorityElement(int[] nums) {

        int count1 = 0, count2 = 0, ele1 = 0, ele2 = 0, n = nums.length, l1 = 0, l2 = 0;

        for(int i = 0; i < n; i++){
            if(count1 == 0 && ele2 != nums[i] ){
                ele1 = nums[i];
                count1++;
            }else if(count2 == 0 && ele1 != nums[i]){
                ele2 = nums[i];
                count2++;
            }else if(ele1 == nums[i]){
                count1++;
        
            }else if(ele2 == nums[i]){
                count2++;
            }else{
                count2--;
                count1--;
            }
        }

        for(int i = 0; i < n; i++){
            if(ele1 == nums[i])l1++;
            else if(ele2 == nums[i])l2++;
        }

        List<Integer> list = new ArrayList<>();

        if(l1 > n/3)list.add(ele1);
        if(l2 > n/3)list.add(ele2);

        return list;
        
    }
}