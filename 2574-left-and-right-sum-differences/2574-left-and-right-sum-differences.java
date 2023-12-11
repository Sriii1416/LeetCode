class Solution {
    public int[] leftRightDifference(int[] nums) {
        int left[] = new int[nums.length];
        int right[] = new int[nums.length];
        int sum1=0;
        for(int i=0;i<nums.length;i++){
            left[i] = sum1;
            sum1 += nums[i];
        }
        int sum2 = 0;
        for(int i=nums.length-1;i>=0;i--){
            right[i] = sum2;
            sum2 += nums[i];
        }
        int ans[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i] = Math.abs(left[i] - right[i]);
        }
        return ans;
    }
}