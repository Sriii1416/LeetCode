class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int i=0;i<accounts.length;i++){
            int t =0;
            for(int j=0;j<accounts[i].length;j++){
                t += accounts[i][j];
            }
            if(t > max){
                max = t;
            }
        }
        return max;
    }
}