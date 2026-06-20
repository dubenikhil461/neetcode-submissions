class Solution {
    public int maxArea(int[] heights) {
        // brute
        int max_water = 0;
        int n = heights.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int width = j - i;
                int height = Math.min(heights[i], heights[j]);
                int area = height * width;
                max_water = Math.max(area, max_water);
            }
        }
        return max_water;
    }
}
