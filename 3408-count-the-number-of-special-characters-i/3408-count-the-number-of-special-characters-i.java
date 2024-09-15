class Solution {
    public int numberOfSpecialChars(String word) {
        int arr1[] = new int[26];
        int arr2[] = new int[26];
        int c = 0;

        for(int i=0;i<word.length();i++){
            if(word.charAt(i) >= 65 && word.charAt(i) <= 90){
                arr1[word.charAt(i) - 'A']++;
            }
        }

        for(int i=0;i<word.length();i++){
            if(word.charAt(i) >= 97 && word.charAt(i) <= 122){
                arr2[word.charAt(i) - 'a']++;
            }
        }

        for(int i=0;i<26;i++){
            if(arr1[i] != 0 && arr2[i] != 0 ){
                c++;
            }
        }
        return c;
    }
}