class Solution {
    List<List<Integer>> ans;

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ans = new ArrayList<>();
        helper(candidates, target, 0, 0, new ArrayList<>());
        return ans;
    }

    private void helper(int[] candidates, int target, int sum, int indx, List<Integer> list) {
        if (sum == target) {
            ans.add(new ArrayList<>(list));
            return;
        }

        if (sum > target || indx == candidates.length) return;

        list.add(candidates[indx]);
        helper(candidates, target, sum + candidates[indx], indx, list);
        list.remove(list.size() - 1);
        helper(candidates, target, sum, indx + 1, list);
    }
}