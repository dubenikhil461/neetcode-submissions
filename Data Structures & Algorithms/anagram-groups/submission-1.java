class Solution {
    public String sortString(String s ){
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        String sorted = new String(ch);
        return sorted;
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>map = new HashMap<>();
        for(int i = 0;i<strs.length;i++){
            String sorted = sortString(strs[i]);
            if(!map.containsKey(sorted)){
                map.put(sorted,new ArrayList<>());
            }
            map.get(sorted).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}
