class Solution {
    public boolean isFreqSame(int[] freq, int[] freq1) {
        for (int i = 0; i < 26; i++) {
            if (freq[i] != freq1[i]) {
                return false;
            }
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        int freq[] = new int[26];
        Arrays.fill(freq, 0);
        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;
        }
        int windowsize = s1.length();
        for (int j = 0; j < s2.length(); j++) {
            int windowfreq[] = new int[26];
            Arrays.fill(windowfreq, 0);
            int windowidx = 0;
            int idx = j;
            while (windowidx < windowsize && idx < s2.length()) {
                windowfreq[s2.charAt(idx) - 'a']++;
                windowidx++;
                idx++;
            }
            if (isFreqSame(freq, windowfreq)) {
                return true;
            }
        }
        return false;
    }
}
