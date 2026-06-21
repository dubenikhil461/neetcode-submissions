class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] map = new int[256];
        Arrays.fill(map, -1);
        int max_length = 0;
        int n = s.length();
        int i = 0;
        int j = 0;
        while (i < n && j < n) {
            if (map[s.charAt(j)] != -1) {
                i = Math.max(i, map[s.charAt(j)] + 1);
            }
            int length = j - i + 1;
            max_length = Math.max(length, max_length);
            map[s.charAt(j)] = j;
            j++;
        }
        return max_length;
    }
}
