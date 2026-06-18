class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        while (i < j) {
            int tar = numbers[j] + numbers[i];
            if (tar > target) {
                j--;
            }
            if (tar < target) {
                i++;
            }
            if (tar == target) {
                return new int[] {i + 1, j + 1};
            }
        }
        return new int[] {};
    }
}
