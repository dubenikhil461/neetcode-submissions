class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> outerset = new HashSet<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            Set<Integer> innerset = new HashSet<>();
            for (int j = i + 1; j < n; j++) {
                int third = -(nums[i] + nums[j]);
                if (innerset.contains(third)) {
                    List<Integer> list = Arrays.asList(nums[i], nums[j], third);
                    Collections.sort(list);
                    outerset.add(list);
                }
                innerset.add(nums[j]);
            }
        }
        List<List<Integer>> result = new ArrayList<>(outerset);
        return result;
    }
}
