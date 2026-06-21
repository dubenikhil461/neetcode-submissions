class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max_length = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            int arr[] = new int[255];
            Arrays.fill(arr, 0);
            for (int j = i; j < n; j++) {
                if (arr[s.charAt(j)] == 1)
                    break;
                int length = j - i + 1;
                max_length = Math.max(length, max_length);
                arr[s.charAt(j)] = 1;
            }
        }
        return max_length;
    }
}
