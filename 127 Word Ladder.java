class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> dict = new HashSet<>(wordList);
        Set<String> vis = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);
        for(int len=1; !queue.isEmpty(); len++){ //len记录BFS层数
            for(int i=queue.size(); i>0; i--){ //遍历完当前队列中的个数后，层数就自增1
                String w = queue.poll();
                if(w.equals(endWord)) return len;
                for(int j=0; j<w.length(); j++){
                    char[] ch = w.toCharArray();
                    for(char c='a'; c<='z'; c++){ //每个位置上的字符，用26个字母进行替换
                        if (c == w.charAt(j)) continue; //相同跳过
                        ch[j] = c; //替换
                        String nb = String.valueOf(ch);
                        if(dict.contains(nb) && vis.add(nb)){ //dict有nb，vis没有nb
                            queue.offer(nb);
                        }
                    }
                }
            }
        }
        return 0;
    }
}