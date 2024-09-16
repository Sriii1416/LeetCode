class Solution {
    public String toGoatLatin(String sentence) {
        String str[] = sentence.split(" ");
        String vow = "aeiouAEIOU";
        String ans = "";
        int c = 1;
        for(String s1 : str){
            String s2 = s1;
            if(vow.indexOf(s2.charAt(0)) != -1){
                ans += (s2+"ma");
            }else{
                ans += s2.substring(1) + s2.substring(0,1) + "ma";
            }
            for(int i=0;i<c;i++){
                ans += "a";
            }
            c++;
            ans += " ";
        }
        return ans.trim();
    }
}