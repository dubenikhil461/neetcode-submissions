class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length ==0 ) return 0;
        HashSet <Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int n = nums.length;
        int longest = 1;
        for (int num : nums) {
            if(!set.contains(num-1)){
            int current = num;
            int streak = 1;
            while (set.contains(current + 1)) {
                streak++;
                current++;
            }
            longest = Math.max(longest, streak);
            }
        }
        return longest;
    }
}
