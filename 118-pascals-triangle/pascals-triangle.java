class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(List.of(1));
        while(list.size()< numRows){
            List<Integer> row = new ArrayList<>();
            row.add(1);
            int curr = list.size() - 1;
            List<Integer> prev = list.get(curr);
            for(int i = 0; i < prev.size()-1; i++){
                row.add(prev.get(i) + prev.get(i + 1));
            }
            row.add(1);
            list.add(row);
        }

        return list;

    }
}