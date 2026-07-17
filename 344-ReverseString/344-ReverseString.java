// Last updated: 7/17/2026, 11:56:45 PM
class Solution {
    public void reverseString(char[] s) {
        char left=0;
        int right=s.length-1;
        while (left < right){
        char temp=s[left];
        s[left]=s[right];
        s[right]=temp;
        left++;
        right--; 
    }
  }
}