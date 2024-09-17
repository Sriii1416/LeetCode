class Solution {
    public String sortString(String s) {
        int arr[] = new int[26];
        int c = 0;
        int len = s.length();
        for(int i=0;i<len;i++){
            arr[s.charAt(i) - 'a']++;
        }
        String str = "";
        while(str.length() != len){
            for(int i=0;i<26;i++){
                if(arr[i] != 0){
                    str += (char)(i + 'a');
                    arr[i]--;
                }
            }
            for(int j=25;j>=0;j--){
                if(arr[j] != 0){
                    str += (char)(j + 'a');
                    arr[j]--;
                }
            }
           // System.out.println(str);
        }
        return str;

    }
}