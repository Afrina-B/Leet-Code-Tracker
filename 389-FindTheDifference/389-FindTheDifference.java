// Last updated: 7/17/2026, 11:56:40 PM
class Solution {
    public char findTheDifference(String s, String t) {
        int ans = 0;

        for (char c : s.toCharArray()) {
            ans ^= c;
        }

        for (char c : t.toCharArray()) {
            ans ^= c;
        }

        return (char) ans;
    }
}