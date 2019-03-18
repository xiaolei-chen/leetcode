class Solution {
    public boolean checkValidString(String s) {
        int left = 0, right = 0;
        int n = s.length();
        for(int i=0; i<n; ++i){
            if(s.charAt(i)=='(' || s.charAt(i)=='*'){
                ++left;
            }else{
                --left;
            }
            if(left < 0){ //���Ϸ�
                return false;
            }
        }
        if(left == 0){
            return true;
        }
        for(int i=n-1; i>=0; --i){
            if(s.charAt(i)==')' || s.charAt(i)=='*'){
                ++right;
            }else{
                --right;
            }
            if(right < 0){ //���Ϸ�
                return false;
            }
        }
        return true;
    }
}