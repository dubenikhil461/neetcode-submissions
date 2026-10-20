class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        solve(0, target, result, new ArrayList<>(), nums);
        return result;
    }

    void solve(int start, int remaining, List<List<Integer>> result, List<Integer> current, int[] nums) {
        if (remaining == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < nums.length; i++) {
            if (nums[i] > remaining)
                break;
            current.add(nums[i]);
            solve(i, remaining - nums[i], result, current, nums);
            current.remove(current.size() - 1);
        }
    }
}
