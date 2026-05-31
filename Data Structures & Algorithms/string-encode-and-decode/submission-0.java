class Solution {

    public String encode(List<String> strs) {
        StringBuilder encode = new StringBuilder();
        for(String str : strs){
            encode.append(str.length()).append("#").append(str);
        }
        return encode.toString();
    }

    public List<String> decode(String s) {  
    List<String> res = new ArrayList<>();  
    int i = 0;  

    while (i < s.length()) {  
        int j = i;  

        // find #
        while (s.charAt(j) != '#') {  
            j++;  
        }  

        int length = Integer.parseInt(s.substring(i, j));  
        j++; // move after '#'  

        String word = s.substring(j, j + length);  
        res.add(word);  

        i = j + length;  
    }  

    return res;  
}
}
