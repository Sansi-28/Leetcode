class Solution {
    List<List<Integer>> ans;

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        ans = new ArrayList<>();
        Arrays.sort(candidates);
        helper(candidates, target, 0, 0, new ArrayList<>());
        return ans;
    }

    private void helper(int[] candidates, int target, int sum, int start, List<Integer> list) {
        if (sum == target) {
            ans.add(new ArrayList<>(list));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            if (sum + candidates[i] > target) break;
            if (i > start && candidates[i] == candidates[i - 1]) continue;

            list.add(candidates[i]);
            helper(candidates, target, sum + candidates[i], i + 1, list); 
            list.remove(list.size() - 1);
        }
    }
}