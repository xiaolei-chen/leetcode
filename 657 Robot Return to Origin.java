class Solution {
    public boolean judgeCircle(String moves) {
        int count1 = 0;
        int count2 = 0;
        for(char move: moves.toCharArray()){
            if(move == 'U'){
                count1++;
            }else if(move == 'D'){
                count1--;
            }else if(move == 'R'){
                count2++;
            }else if(move == 'L'){
                count2--;
            }
        }
        return count1==0 && count2==0;
    }
}