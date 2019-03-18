class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length() + 1]; //dp[i]表示范围[0, i)内的子串是否可以拆分，dp的长度比s串的长度大1，是因为要handle空串的情况
        Set<String> set = new HashSet<>();
        set.addAll(wordDict);
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = i - 1; j >= 0; j--) { //[0, j)和[j, i), [0, j)就是dp[j], [j, i)就是s.substr(j, i)
                dp[i] = dp[j] && set.contains(s.substring(j, i));
                if(dp[i]){
                    break; //不需要再用j去分[0, i)范围了，因为[0, i)范围已经可以拆分了
                }
            }
        }
        return dp[s.length()];
    }
}