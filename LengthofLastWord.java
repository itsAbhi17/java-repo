class Solution {
    public int lengthOfLastWord(String s) {
        // Trim leading and trailing spaces, then split by space
        String[] words = s.trim().split(" ");
        // Return the length of the last word
        return words[words.length - 1].length();
    }

    // Optional: main method to test
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.lengthOfLastWord("Hello World")); // Output: 5
        System.out.println(sol.lengthOfLastWord("   fly me   to   the moon  ")); // Output: 4
        System.out.println(sol.lengthOfLastWord("luffy is still joyboy")); // Output: 6
    }
}
