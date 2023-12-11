class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        String ar[] = new String[words.length];
        for(int i=0;i<words.length;i++){
            char ch[] = words[i].toCharArray();
            Arrays.sort(ch);
            String s = "";
            for(int j=0;j<ch.length;j++){
                s += ch[j];
            }
            ar[i] = s;
        }
        int c =0;
        for(int i=0;i<ar.length;i++){
            for(int j=i+1;j<ar.length;j++){
                if(ar[i].equals(ar[j])){
                    c++;
                }
            }
        }
        return c;
    }
}