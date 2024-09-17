class Solution {
    public String greatestLetter(String s) {
        int arr1[] = new int[26];
        int arr2[] = new int[26];

        for(int i=0;i<s.length();i++){
            if(s.charAt(i) >= 65 && s.charAt(i) <= 90){
                arr1[s.charAt(i) - 'A']++;
            }else if(s.charAt(i) >= 97 && s.charAt(i) <= 122){
                arr2[s.charAt(i) - 'a']++;
            }
        }
        String str = "";
        for(int i=25;i>=0;i--){
            if(arr1[i] != 0 && arr2[i] != 0){
                str += (char)(i + 'A');
                break;
            }
        }
        return str;
    }
}