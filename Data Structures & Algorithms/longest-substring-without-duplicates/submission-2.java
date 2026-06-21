class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int max_length = 0;
        int n = s.length();
        int i = 0;
        int j = 0;
        while (i < n && j < n) {
            if (map.containsKey(s.charAt(j))) {
                int length = j - i;
                max_length = Math.max(length, max_length);
                i = Math.max(i, map.get(s.charAt(j)) + 1);
            }
            int length = j - i + 1;
            max_length = Math.max(length, max_length);
            map.put(s.charAt(j), j);
            j++;
        }
        return max_length;
    }
}
