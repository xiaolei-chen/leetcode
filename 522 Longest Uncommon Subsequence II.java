class Solution {
    public int findLUSlength(String[] strs) {
        int res = -1, n = strs.length;
        for(int i=0; i<n; ++i){
            int j = 0;
            while(j < n){
                if(i!=j && isSubsequence(strs[i], strs[j])){
                    break;
                }
                j++;
            }
            if(j == n){
                res = Math.max(res, strs[i].length());
            }
        }
        return res;
    }
    
    private boolean isSubsequence(String a, String b){//a是否为b的子序列
        int i = 0, j = 0;
        for(j=0; i<a.length() && j<b.length(); j++){
            if(a.charAt(i) == b.charAt(j)){
              i++;
            }
        }
        return i == a.length();
    }
}