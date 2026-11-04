class Solution {
    public int[] twoSum(int[] nums, int target) {
        if (nums == null) {
            throw new IllegalArgumentException("integer array nums can not be null");
        }
        if (nums.length < 2 || nums.length > 1000) {
            throw new IllegalArgumentException("the length of nums must be between 2 and 1000");
        }
        if (target < Math.pow(-10, 7) || target > Math.pow(10, 7)) {
            throw new IllegalArgumentException("target must be between - 10 ^ 7 and 10 ^ 7");
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {0, 0};
    }
}
