class Solution {
    public int[] separateDigits(int[] nums) {
        String str = "";
        for(int i=0;i<nums.length;i++){
            str += Integer.toString(nums[i]);
        }
        int len = str.length();
        int ans[] = new int[len];
        for(int i=0;i<len;i++){
            String s = "";
            s += str.charAt(i);
            ans[i] = Integer.parseInt(s);
        }
        return ans;
    }
}