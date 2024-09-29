class Solution {
    public String convert(String s, int numRows) {
        String str[] = new String[numRows];
        int c = 0;
        int f = 0;
        int i = 0;
        for(int j=0;j<numRows;j++){
            str[j] = "";
        }
        while(i < s.length()){
            if(c == 0){
                f = 1;
            }else if(c == numRows){
                f = 0;
            }

            if(f == 1){
                str[c++] += s.charAt(i);
                i++;
            }else{
                --c;
                if(c > 1){
                    str[c-1] += s.charAt(i);
                    i++;
                } 
            }
            
        }
        String ans = "";
        for(String st : str){
            ans += st;
        }
        return ans;
    }
}