// Last updated: 7/17/2026, 11:58:42 PM
class Solution {
    public boolean isPalindrome(int x) {
        if (x<0) return false;
        int original=x;
        int rev =0;
        while(x!=0){
            rev=rev*10+x%10;
            x=x/10;

        }
        return original ==rev;
    }
}