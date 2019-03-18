class Solution {
    public int expressiveWords(String S, String[] words) {
        int count = 0;
        for(String W: words){
            int i = 0, j = 0; // S & W's pointers.
            int n = S.length(), m = W.length();
            for(i=0 ; i<n; ++i){
                if(j<m && S.charAt(i)==W.charAt(j)){ // matches, w pointer j 1 step forward to move together with i
                    j++;
                }else if(i>0 && i<n-1 && S.charAt(i-1)==S.charAt(i) && S.charAt(i)==S.charAt(i+1) ){ // previous, current & next are same.
                    i++; // S pointer 1 step forward, attempt to traverse the repeated chars.
                }else if(!(i>1 && S.charAt(i-2)==S.charAt(i) && S.charAt(i-1)==S.charAt(i))){ // current & previous 2 are not same. 
                    break; // No match.
                }
            }
            if(i==n && j==m){
                count++;
            }
        }
        return count;
    }
}