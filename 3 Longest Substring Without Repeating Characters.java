class Solution { //  "pwwkew"
    public int lengthOfLongestSubstring(String s) {
        int[] temp = new int[256]; //ASCII���ܱ�ʾ256���ַ����������ڼ���ֻ�ܱ�ʾ128���ַ���������128Ҳ��
        Arrays.fill(temp, -1); //��ʼ��ӳ��ֵΪ-1
        int res = 0;
		int left = -1; //�������ڣ�leftΪ��߽磬������ǰһ�������Գ�ʼ������-1
        for (int i = 0; i < s.length(); ++i) { //���ڵ��ұ߽���ǵ�ǰ���������ַ���λ��
            left = Math.max(left, temp[s.charAt(i)]); //������ַ��Ѿ���Map�д����ˣ����������ӳ��ֵ����left�Ļ�����ô����leftΪ��ǰӳ��ֵ
            temp[s.charAt(i)] = i; //ӳ��ֵ����Ϊ��ǰ����i��������֤��leftʼ��Ϊ��ǰ�߽��ǰһ��λ��
            res = Math.max(res, i - left); //���㴰�ڳ���
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