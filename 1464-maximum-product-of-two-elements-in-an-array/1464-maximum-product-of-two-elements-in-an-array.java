class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int l = nums.length-1;
        return (nums[l] - 1) * (nums[l-1] - 1);
    }
}