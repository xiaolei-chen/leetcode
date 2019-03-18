class Solution {
    public String reverseOnlyLetters(String S) {
        char[] chars = S.toCharArray();
        int i = 0;
        int j = S.length()-1;
        while(i<j){
            while(i<j && !Character.isLetter(chars[i])){
                ++i;
            }
            while(i<j && !Character.isLetter(chars[j])){
                --j;
            }
            swap(chars, i, j);
            ++i;
            --j;
        }
        return new String(chars);
    }
    
    private void swap(char[] chars, int i, int j){
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}


/*
class Solution {
    public String reverseOnlyLetters(String S) {
        Stack<Character> letters = new Stack<>();
        for(char c: S.toCharArray()){
            if(Character.isLetter(c)){
                letters.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char c: S.toCharArray()){
            if(Character.isLetter(c)){
                sb.append(letters.pop());
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
*/