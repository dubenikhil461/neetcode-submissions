class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        recursivecall(0, nums,curr, result);
        return result;
    }

    public void recursivecall(
        int index, int[] nums, List<Integer> curr, List<List<Integer>> result) {
            if(index == nums.length){
                result.add(new ArrayList<>(curr));
                return;
            }
            curr.add(nums[index]);
            recursivecall(index+1,nums,curr,result);
            curr.remove(curr.size()-1);
            int skipidx = index +1;
            while(skipidx <nums.length && nums[skipidx] == nums[skipidx-1]){
                skipidx++;
            }
            recursivecall(skipidx,nums,curr,result);
        }
}

