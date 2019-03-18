class Solution {
    public boolean checkRecord(String s) {
        int countA = 0;
        int countL = 0;
        for(char c: s.toCharArray()){
            if(c == 'A'){
                countA++;
                countL = 0;
                if(countA > 1){ //不能缺勤两次
                    return false;
                }
            }else if(c == 'L'){
                countL++;
                if(countL > 2){ //不能连续迟到三次
                    return false;
                }
            }else{
                countL = 0;
            }
        }
        return true;
    }
}