class Solution {
    public boolean validPalindrome(String s) {
        int l = -1;
        int r = s.length();
        while(++l < --r){
            if(s.charAt(l) != s.charAt(r)){
                return isPalindrome(s, l-1, r) || isPalindrome(s, l, r+1);
            }
        }
        return true;
    }
    
    private boolean isPalindrome(String s, int l, int r){
        while(++l < --r){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
        }
        return true;
    }
}