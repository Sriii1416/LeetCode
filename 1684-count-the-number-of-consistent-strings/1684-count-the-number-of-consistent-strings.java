class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean b = false;
        int c = 0;
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words[i].length();j++){
                char s = words[i].charAt(j);
                String str = "";
                str += s;
                if(allowed.contains(str)){
                    b = true;
                }else{
                    b = false;
                    break;
                }
            }
            if(b == true){
                c++;
            }
        }
        return c;
    }
}