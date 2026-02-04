class Solution {
    public int[] findErrorNums(int[] nums) {
        int [] arr = new int [2];

        Set<Integer> set = new HashSet<>();

        for(int e : nums){
            if(set.contains(e)){
                arr[0] = e;
            }

            set.add(e);
        }

        for(int i = 1; i <= nums.length; i++){
            if(!set.contains(i)){
                arr[1] = i;
                break;
            }
        }

        return arr;
    }
}