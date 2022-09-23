public class MaxWordsSentence {
    public static void main(String[] args) {
        String[] sentences = {"please wait", "continue to fight", "continue to win"};
        System.out.println(mostWordsFound(sentences));
    }

    public static int mostWordsFound(String[] sentences) {
        int j = 0 , maxLen = 0 , len = 0;

        for(int i = 0 ; i < sentences.length ; i++)
        {
            while(sentences[i].length() > j)
            {
                if(sentences[i].charAt(j) == ' ')
                {
                    len++;
                }
                j++;
            }
            j = 0;
            maxLen = (maxLen < len) ? len : maxLen;
            len = 0;
        }

        return maxLen + 1;
    }
}
