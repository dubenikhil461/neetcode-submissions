class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == '[' || s.charAt(i) == '{' || s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            } else {
                if (stack.isEmpty())
                    return false;
                char top = stack.pop();
                if (top != map.get(s.charAt(i))) {
                    return false;
                }
            }
            i++;
        }
        return stack.isEmpty();
    }
}
