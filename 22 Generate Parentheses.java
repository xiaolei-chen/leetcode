class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        backtrack(res, "", 0, 0, n);
        return res;
    }
    
    public static void backtrack(List<String> res, String str, int left, int right, int max){
        if(str.length() == max*2){
            res.add(str);
            return;
        }
        if(left < max){
            backtrack(res, str+"(", left+1, right, max);
        }
        if(left > right){
            backtrack(res, str+")", left, right+1, max);
        }
    }
}