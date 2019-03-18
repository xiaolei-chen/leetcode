class Solution { //马拉车算法
    public String longestPalindrome(String s) {
        char[] newStr = new char[s.length() * 2 + 1];
        newStr[0] = '#';
        for (int i = 0; i < s.length(); i++) {
            newStr[2 * i + 1] = s.charAt(i);
            newStr[2 * i + 2] = '#';
        }
        int[] dp = new int[newStr.length];
        /**
         * For better understanding, here we define "friend substring", or "friend":
         * "friend substring" has the largest end-index in all checked substrings that
         * are palindromes. We start at friendCenter = 0 and update it in each cycles.
         */
        int friendCenter = 0, friendRadius = 0, lpsCenter = 0, lpsRadius = 0;
        for (int i = 0; i < newStr.length; i++) {
            dp[i] = (friendCenter + friendRadius > i) ? Math.min(dp[friendCenter * 2 - i], (friendCenter + friendRadius) - i) : 1;
                /**
                 *     friendStart   j             friendCenter  i     friendEnd                         
                 *               |   |             |             |     |
                 * String: - - d c b a b c d - - - - - - - d c b a b c ? - - - - - - - -
                 *               [--------friend (palindrome)--------]
                 *
                 * In this example, (friendEnd - i) = 3, so we can only be certain that radius <= 3 part around i
                 * is a palindrome (i.e. "cbabc" part). We still need to check the character at "?".
                 */
            /* Check palindrome and expand dp[i] */
            while (i + dp[i] < newStr.length && i - dp[i] >= 0 && newStr[i + dp[i]] == newStr[i - dp[i]])
                dp[i]++;
            /* Check if i should become the new friend */
            if (friendCenter + friendRadius < i + dp[i]) {
                friendCenter = i;
                friendRadius = dp[i];
            }
            /* Update longest palindrome */
            if (lpsRadius < dp[i]) {
                lpsCenter = i;
                lpsRadius = dp[i];
            }
        }
        return s.substring((lpsCenter - lpsRadius + 1) / 2, (lpsCenter + lpsRadius - 1) / 2);
    }
}

/*
class Solution {
    
    private int lo, maxLen;

    public String longestPalindrome(String s) {
	    int len = s.length();
	    if (len < 2){
		    return s;
        }
        for (int i = 0; i < len-1; i++) {
     	    extendPalindrome(s, i, i);  //assume odd length, try to extend Palindrome as possible
     	    extendPalindrome(s, i, i+1); //assume even length.
        }
        return s.substring(lo, lo + maxLen);
    }

    private void extendPalindrome(String s, int j, int k) {
	    while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
		    j--;
		    k++;
	    }
	    if (maxLen < k - j - 1) {
		    lo = j + 1;
		    maxLen = k - j - 1;
	    }
    }
}
*/