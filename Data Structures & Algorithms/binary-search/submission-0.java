class Solution {
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        return binarySearch(0, nums.length - 1, nums, target);
    }

    public int binarySearch(int l, int r, int[] nums, int target) {
        if(l > r) return -1;
        int m = l + (r - l) / 2;

        if (nums[m] == target) {
            return m;
        } else if (target < nums[m]) {
            return binarySearch(l, m-1, nums, target);
        } else {
            return binarySearch(m + 1, r, nums, target);
        }
    }
}
