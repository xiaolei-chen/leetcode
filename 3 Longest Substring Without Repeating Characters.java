class Solution { //  "pwwkew"
    public int lengthOfLongestSubstring(String s) {
        int[] temp = new int[256]; //ASCII表共能表示256个字符，但是由于键盘只能表示128个字符，所以用128也行
        Arrays.fill(temp, -1); //初始化映射值为-1
        int res = 0;
		int left = -1; //滑动窗口，left为左边界，由于是前一个，所以初始化就是-1
        for (int i = 0; i < s.length(); ++i) { //窗口的右边界就是当前遍历到的字符的位置
            left = Math.max(left, temp[s.charAt(i)]); //如果该字符已经在Map中存在了，并且如果其映射值大于left的话，那么更新left为当前映射值
            temp[s.charAt(i)] = i; //映射值更新为当前坐标i，这样保证了left始终为当前边界的前一个位置
            res = Math.max(res, i - left); //计算窗口长度
        }
        return res;
    }
}

/*
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            // try to extend the range [i, j]
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            }
            else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }
}
*/