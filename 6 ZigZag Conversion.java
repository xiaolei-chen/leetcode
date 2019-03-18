class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1){
            return s;
        }
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        int cycLen = 2 * numRows - 2;
        for(int i = 0; i < numRows; ++i){
            for(int j = 0; j + i < n; j += cycLen){
                sb.append(s.charAt(j + i));
                if(i != 0 && i != numRows - 1 && j + cycLen - i < n){ //��ǰ����+cycLen-��ǰ����
                    sb.append(s.charAt(j + cycLen - i));
                }
            }
        }
        return sb.toString();
    }
}