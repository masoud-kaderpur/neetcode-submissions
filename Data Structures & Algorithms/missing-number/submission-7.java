class Solution {
    public int missingNumber(int[] numbers) {
        if (numbers == null) {
            // return -1;
            throw new IllegalArgumentException("the integer array numbers must not be null");
        }
        if (numbers.length == 0) {
            // return -1;
            throw new IllegalArgumentException("the integer array numbers must not be empty");
        }

        List<Integer> list = new ArrayList<>();

        int n = numbers.length;

        // O(n)
        for (int i = 0; i < n; i++) {
            list.add(numbers[i]);
        }

        for (int i = 0; i < numbers.length + 1; i++) {
            if (!list.contains(i)) {
                return i;
            }
        }

        return -1;
    }
}
