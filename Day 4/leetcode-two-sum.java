class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int j = 0; j < nums.length; j++) {
            for (int i = nums.length - 1; i > j; i--) {
                if (nums[j] + nums[i] == target) {
                    return new int[] { j, i };
                }
            }
        }
        return null;
    }
}