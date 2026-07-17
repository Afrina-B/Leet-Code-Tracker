// Last updated: 7/17/2026, 11:58:26 PM
class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.trim().split("\\s+");
        return words[words.length - 1].length();
    }
}