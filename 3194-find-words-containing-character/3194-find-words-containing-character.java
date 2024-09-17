class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ar = new ArrayList<Integer>();
        for(int i=0;i<words.length;i++){
            if(words[i].indexOf(Character.toString(x)) != -1){
                ar.add(i);
            }
        }
        return ar;
    }
}