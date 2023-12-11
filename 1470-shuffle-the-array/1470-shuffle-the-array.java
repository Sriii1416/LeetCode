class Solution {
    public int[] shuffle(int[] nums, int n) {
        int ans[] = new int[nums.length];
        int start = 0,end = n,k=0;
        for(int i=0;i<n;i++){
            ans[k++] = nums[start++];
            ans[k++] = nums[end++];
        }
        return ans;
    }
}