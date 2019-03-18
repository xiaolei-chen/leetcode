class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> lines = new ArrayList<String>();
        int index = 0;
        while (index < words.length) {
            //count���������е����ۼ��ܳ���
            int count = words[index].length();
            //last:�������һ���ʵ�index
            int last = index + 1;
            while (last < words.length) {
                //out of bound
                if (words[last].length() + count + 1 > maxWidth) break;
                //plus one for the space, if its a perfect fit it will fit
                count += 1 + words[last].length();
                last++;
            }
            StringBuilder builder = new StringBuilder();
            //append���е�һ������
            builder.append(words[index]);
            //��һ�г�ȥ��һ���Ѿ�append�ĵ��ʣ���ʣ�¼������diff ������index��last-1
            int diff = last - index - 1;
           // if last line or number of words in the line is 1, left-justified
            //���һ�У�ÿ�������м�һ���ո� ʣ�ಹ�Ͽհ�
            if (last == words.length || diff == 0) {
                for (int i = index+1; i < last; i++) {
                    builder.append(" ");
                    builder.append(words[i]);
                }
                for (int i = builder.length(); i < maxWidth; i++) {
                    builder.append(" ");
                }
            } else {
                //�������һ�У�middle justified
                //��һ����space�ĸ�����������-�ۼƵ����ܳ��ȣ�
                //ÿ�����ʺ���space�ĸ�����������-�ۼƵ����ܳ��ȣ�/���ʸ���
                // rΪ��Ҫƽ�����䵽�м�Ŀո�����
                int spaces = (maxWidth - count) / diff;
                int r = (maxWidth - count) % diff;
                for (int i = index+1; i < last; i++) {
                    for(int k=spaces; k > 0; k--) {
                        builder.append(" ");
                    }
                    if(r > 0) {
                        builder.append(" ");
                        r--;
                    }
                    builder.append(" ");
                    builder.append(words[i]);
                }
            }
            lines.add(builder.toString());
            index = last;
        }
        return lines;
    }
}