class Solution {
    public int compress(char[] chars) {
        int index = 0;
        int indexAns = 0;
        while(index < chars.length){
            char currentChar = chars[index];
            int count = 0;
            while(index < chars.length && currentChar == chars[index]){
                index++;
                count++;
            }
            chars[indexAns] = currentChar;
            indexAns++;
            if(count != 1){
                for(char c: Integer.toString(count).toCharArray()){
                    chars[indexAns] = c;
                    indexAns++;
                }
            }
        }
        return indexAns;
    }
}