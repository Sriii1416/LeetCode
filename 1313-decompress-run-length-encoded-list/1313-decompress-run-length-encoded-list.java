class Solution {
    public int[] decompressRLElist(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(i % 2 == 0){
                c += nums[i];
            }
        }
        int ans[] = new int[c];
        int k=0;
        for(int i=0;i<nums.length-1;i=i+2){
            int n = nums[i];
            int m = nums[i+1];
            for(int j=0;j<n;j++){
                ans[k++] = m;
            }
        }
        return ans;
    }
}