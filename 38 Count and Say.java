clclass Solution {
    public String countAndSay(int n) {
        StringBuilder prev = new StringBuilder();
        StringBuilder curr = new StringBuilder("1");
        int count = 1;
        char say;
        for(int i=1; i<n; ++i){
            prev = curr;
            curr = new StringBuilder();
            count = 1;
            say = prev.charAt(0);
            for(int j=1; j<prev.length(); ++j){
                if(prev.charAt(j) != say){
                    curr.append(count).append(say);
                    say = prev.charAt(j);
                    count = 1;
                }else{
                    count++;
                }
            }
            curr.append(count).append(say);
        }
        return curr.toString();
    }
}