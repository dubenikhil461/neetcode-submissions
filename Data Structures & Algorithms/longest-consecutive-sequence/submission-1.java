class Solution {
    public boolean contains(int[] nums, int target) {
        for (int num : nums) {
            if (num == target)
                return true;
        }
        return false;
    }
    public int longestConsecutive(int[] nums) {
        if(nums.length ==0 ) return 0;
        int n = nums.length;
        int longest = 1;
        for (int i = 0; i < n; i++) {
            int current = nums[i];
            int streak = 1;
            while (contains(nums, current + 1)) {
                streak++;
                current++;
            }
            longest = Math.max(longest, streak);
        }
        return longest;
    }
}
