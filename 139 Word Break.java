class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length() + 1]; //dp[i]��ʾ��Χ[0, i)�ڵ��Ӵ��Ƿ���Բ�֣�dp�ĳ��ȱ�s���ĳ��ȴ�1������ΪҪhandle�մ������
        Set<String> set = new HashSet<>();
        set.addAll(wordDict);
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = i - 1; j >= 0; j--) { //[0, j)��[j, i), [0, j)����dp[j], [j, i)����s.substr(j, i)
                dp[i] = dp[j] && set.contains(s.substring(j, i));
                if(dp[i]){
                    break; //����Ҫ����jȥ��[0, i)��Χ�ˣ���Ϊ[0, i)��Χ�Ѿ����Բ����
                }
            }
        }
        return dp[s.length()];
    }
}