class Solution {
    public String sortString(String str){
        char arr[] = str.toCharArray();
        Arrays.sort(arr);
        String sorted = new String(arr);
        return sorted;
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>map = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String sorted = sortString(strs[i]);
            if(!map.containsKey(sorted)){
                map.put(sorted,new ArrayList<>());
            }
            map.get(sorted).add(strs[i]); // add into list
        }
        return new ArrayList<>(map.values());
    }
}
