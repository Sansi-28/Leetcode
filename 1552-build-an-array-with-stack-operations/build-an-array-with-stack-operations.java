class Solution {
    public List<String> buildArray(int[] target, int n) {

        List<String> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();


        for(int e : target){
            set.add(e);
        }

        int count = 0;

        for(int i = 1; i <= n; i++){
            if(set.contains(i)){
                count++;
                list.add("Push");
            }else{
                list.add("Push");
                list.add("Pop");
            }
            

            if(count == target.length)break;
        }

        return list;

    }
}