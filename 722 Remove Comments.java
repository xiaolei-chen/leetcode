class Solution {
    public List<String> removeComments(String[] source) {
        List<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        boolean mode = false;
        for(String s: source){
            for(int i=0; i<s.length(); ++i){
                if(mode){
                    if(s.charAt(i)=='*' && i<s.length()-1 && s.charAt(i+1)=='/'){
                        i++;
                        mode = false;
                    }
                }else{
                    if(s.charAt(i)=='/' && i<s.length()-1 && s.charAt(i+1)=='/'){
                        break;
                    }else if(s.charAt(i)=='/' && i<s.length()-1 && s.charAt(i+1)=='*'){
                        i++;
                        mode = true;
                    }else{
                        sb.append(s.charAt(i));
                    }
                }
            }
            if(!mode && sb.length()>0){
                res.add(sb.toString());
                sb = new StringBuilder();
            }
        }
        return res;
    }
}