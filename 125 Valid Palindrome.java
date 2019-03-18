class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int l = -1;
        int r = s.length();
        while(++l < --r){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
        }
        return true;
    }
}