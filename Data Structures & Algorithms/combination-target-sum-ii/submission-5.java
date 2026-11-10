class Solution {
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        resultFromReccursion(0, nums, target, curr, result);
        return result;
    }
    public void resultFromReccursion(
        int index, int nums[], int target, List<Integer> curr, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList(curr));
            return;
        }
        if (index == nums.length || target < 0) {
            return;
        }
        curr.add(nums[index]);
        resultFromReccursion(index + 1, nums, target - nums[index], curr, result);
        curr.remove(curr.size() - 1);
        int skipidx = index +1;
        while(skipidx<nums.length && nums[skipidx] == nums[skipidx-1]){
            skipidx++;
        }
        resultFromReccursion(skipidx, nums, target, curr, result);
    }
}
