class Solution {
    public String maskPII(String S) {
        String[] country = {"", "+*-", "+**-", "+***-"};
        StringBuilder sb = new StringBuilder();
        int at = S.indexOf("@");
        if(at > 0){
            S = S.toLowerCase();
            sb.append(S.charAt(0)).append("*****").append(S.substring(at-1));
            return sb.toString();
        }
        S = S.replaceAll("[^0-9]", "");
        sb.append(country[S.length()-10]).append("***-***-").append(S.substring(S.length()-4));
        return sb.toString();
    }
}