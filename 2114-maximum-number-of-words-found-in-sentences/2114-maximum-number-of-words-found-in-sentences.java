class Solution {
    public int mostWordsFound(String[] sentences) {
        int len = sentences.length;
        int ar[] = new int[len];
        for(int i=0;i<len;i++){
            int c = 1;
            for(int j=0;j<sentences[i].length();j++){
                if(sentences[i].charAt(j) == ' '){
                    c++;
                }
            }
            ar[i] = c;
        }
        int max = 0;
        for(int i=0;i<len;i++){
            if(ar[i] > max){
                max = ar[i];
            }
        }
        return max;
    }
}