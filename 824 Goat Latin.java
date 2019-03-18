class Solution {
    public String toGoatLatin(String S) {
        Set<Character> vowel = new HashSet<>();
        for(char c: "aeiouAEIOU".toCharArray()){
            vowel.add(c);
        }
        StringBuilder res = new StringBuilder();
        String a = "", add = "a";
        for(String w: S.split(" ")){
            if(vowel.contains(w.charAt(0))){
                res.append(w);
            }else{
                res.append(w.substring(1)).append(w.charAt(0));
            }
            res.append("ma");
            a += add;
            res.append(a+" ");
        }
        return res.toString().trim();
    }
}