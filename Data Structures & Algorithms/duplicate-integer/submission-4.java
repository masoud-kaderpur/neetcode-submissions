class Solution {
    public boolean hasDuplicate(int[] nums) {
        if (nums == null || nums.length == 0 || nums.length > Math.pow(10, 5)) {
            return false;
        }
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            if (num > Math.pow(10, 9) || num < Math.pow(-10, 9)) {
                return false;
            }
            // duplicate existing
            if (list.contains(num)) {
                return true;
            } else {
                list.add(num);
            }
        }
        return false;
    }
}
