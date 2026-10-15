class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        solve(n, "", 0, 0, result);
        return result;
    }

    void solve(int n, String current, int open, int close, List<String> result) {
        if (current.length() == 2 * n) {
            result.add(current);
            return;
        }

        if (open < n) {
            solve(n, current + "(", open + 1, close, result);
        }
        if (close < open) {
            solve(n, current + ")", open, close + 1, result);
        }
    }
}
