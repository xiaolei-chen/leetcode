class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> dict = new HashSet<>(wordList);
        Set<String> vis = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);
        for(int len=1; !queue.isEmpty(); len++){ //len��¼BFS����
            for(int i=queue.size(); i>0; i--){ //�����굱ǰ�����еĸ����󣬲���������1
                String w = queue.poll();
                if(w.equals(endWord)) return len;
                for(int j=0; j<w.length(); j++){
                    char[] ch = w.toCharArray();
                    for(char c='a'; c<='z'; c++){ //ÿ��λ���ϵ��ַ�����26����ĸ�����滻
                        if (c == w.charAt(j)) continue; //��ͬ����
                        ch[j] = c; //�滻
                        String nb = String.valueOf(ch);
                        if(dict.contains(nb) && vis.add(nb)){ //dict��nb��visû��nb
                            queue.offer(nb);
                        }
                    }
                }
            }
        }
        return 0;
    }
}