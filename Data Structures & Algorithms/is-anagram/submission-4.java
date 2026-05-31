class Solution {
    public boolean isAnagram(String s, String t) {
         HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if(!map.containsKey(ch)) return false;
            if (map.containsKey(ch)) {
                int count = map.get(ch);
                if (count > 1)
                    map.put(ch, count - 1);
                else
                    map.remove(ch);
            }
        }
        return map.size()==0;
    }
}
