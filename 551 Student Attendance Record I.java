class Solution {
    public boolean checkRecord(String s) {
        int countA = 0;
        int countL = 0;
        for(char c: s.toCharArray()){
            if(c == 'A'){
                countA++;
                countL = 0;
                if(countA > 1){ //����ȱ������
                    return false;
                }
            }else if(c == 'L'){
                countL++;
                if(countL > 2){ //���������ٵ�����
                    return false;
                }
            }else{
                countL = 0;
            }
        }
        return true;
    }
}