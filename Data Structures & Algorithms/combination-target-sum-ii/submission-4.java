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
        for (int i = index; i < nums.length; i++) {
            if(i>index && nums[i] == nums[i-1]){
                continue;
            }
            if(nums[i]>target){
                break;
            }
            curr.add(nums[i]);
            resultFromReccursion(i+1, nums, target-nums[i], curr, result);
            curr.remove(curr.size() - 1);
        }
    }
}
