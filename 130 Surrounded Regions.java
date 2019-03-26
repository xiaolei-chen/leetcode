class Solution {
    private List<List<String>> res;
    private ArrayList<String> list;
    
    public List<List<String>> partition(String s) {
        res = new ArrayList<List<String>>();
        list = new ArrayList<String>();
        backtrack(s, 0);
        return res;
    }
    
    private void backtrack(String s, int left){
        if(list.size() > 0 && left >= s.length()){
            res.add(new ArrayList<String>(list));
        }
        for(int i=left; i<s.length(); ++i){
            if(isPalindrome(s, left, i)){
                list.add(s.substring(left, i+1));
                backtrack(s, i+1);
                list.remove(list.size() - 1);
            }
        }
    }
    
    private boolean isPalindrome(String s, int left, int right){
        if(left == right){
            return true;
        }
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}