class Solution {
    public boolean detectCapitalUse(String word) {
        String s1 = word.toLowerCase();
        String s2 = word.toUpperCase();
        
        if(s1.equals(word) || s2.equals(word)){
            return true;
        }

        for(int i = 0;i<word.length();i++){
            if(i == 0 && word.charAt(i) != s2.charAt(i)){
                return false;
            }else if(i != 0 && word.charAt(i) != s1.charAt(i)){
                return false;
            }
        }
        return true;
    }
}