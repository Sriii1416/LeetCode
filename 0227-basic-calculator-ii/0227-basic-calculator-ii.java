class Solution {
    public int calculate(String s) {
        
        char prev = '+';
        int num = 0;
        int ans = 0;
        s += '+';
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                num = num * 10 + (s.charAt(i) - '0');
            }
            
            if(!Character.isDigit(s.charAt(i)) && s.charAt(i) != ' '){
               // System.out.println(num);
                if(prev == '+'){
                    st.push(num);
                }else if(prev == '-'){
                    st.push(num * -1);
                }else if(prev == '*'){
                    st.push(st.pop() * num);
                }else if(prev == '/'){
                    st.push(st.pop() / num);
                }
                num = 0;
                prev = s.charAt(i);
            }
            
        }

        while(!st.isEmpty()){
            ans += st.pop();
        }
        return ans;
    }
}