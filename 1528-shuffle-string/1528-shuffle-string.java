class Solution {
    public String restoreString(String s, int[] indices) {
        String str = "";
        for(int i=0;i<s.length();i++){
            for(int j=0;j<indices.length;j++){
                if(i == indices[j]){
                    str += s.charAt(j);
                }
            }
        }
        return str;
    }
}