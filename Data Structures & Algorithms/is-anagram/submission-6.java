class Solution {
    public boolean isAnagram(String s, String t) {
        // basic edge case tests
        if (s == null || t == null) {
            throw new IllegalArgumentException("inputs can not be null");
        }
        if (s.length() == 0l || t.length() == 0l) {
            throw new IllegalArgumentException("inputs can not be empty");
        }
        if (s.length() > 5 * Math.pow(10, 4) || t.length() > 5 * Math.pow(10, 4)) {
            throw new IllegalArgumentException("inputs can not be bigger than 5 * Math(10, 4)");
        }
        if (s.length() > t.length() || s.length() < t.length()) {
            return false;
        }
        // converting to char, sorting, converting back to string
        char[] charsS = s.toCharArray();
        char[] charsT = t.toCharArray();
        Arrays.sort(charsS);
        Arrays.sort(charsT);
        s = new String(charsS);
        t = new String(charsT);
        // check if is anagram
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != t.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
