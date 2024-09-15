class Solution {
    public String reverseVowels(String s) {
        String str = "";
        String vowels = "aeiouAEIOU";
        for(int i=0;i<s.length();i++){
            if(vowels.indexOf(s.charAt(i)) != -1){
                str += s.charAt(i);
            }
        }
        int l = str.length()-1;
        String ans = "";
        for(int i=0;i<s.length();i++){
            if(!vowels.contains(Character.toString(s.charAt(i)))){
                ans += s.charAt(i);
            }else{
                ans += str.charAt(l);
                l--;
            }
        }
        return ans;
    }
}