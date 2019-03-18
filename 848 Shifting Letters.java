class Solution {
     public String shiftingLetters(String S, int[] shifts) {
         StringBuilder res = new StringBuilder(S);
         int n = S.length();
         for(int i=n-2; i>=0; --i){
             shifts[i] = (shifts[i] + shifts[i+1]) % 26;
         }
         for(int i=0; i<n; ++i){
             res.setCharAt(i, (char)((S.charAt(i)-'a'+shifts[i])%26+'a'));
         }
         return res.toString();
    }
}