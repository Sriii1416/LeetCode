class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int l = nums.length-1;
        return (nums[l] * nums[l-1] - (nums[0] * nums[1]));
    }
}