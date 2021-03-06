class Solution {
    public int repeatedStringMatch(String A, String B) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        while(sb.length() < B.length()){
            sb.append(A);
            count++;
        }
        if(sb.toString().contains(B)){
            return count;
        }
        if(sb.append(A).toString().contains(B)){
            count++;
            return count;
        }
        return -1;
    }
}