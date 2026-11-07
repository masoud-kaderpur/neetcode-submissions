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

        Arrays.sort(numbers);

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != i) {
                return i;
            }
        }
        return numbers.length;
    }
}
