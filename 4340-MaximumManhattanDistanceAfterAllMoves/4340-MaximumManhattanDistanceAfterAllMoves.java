// Last updated: 7/17/2026, 11:54:10 PM
class Solution {
    public int maxDistance(String moves) {
        int x=0,y=0,blanks=0;
        for(char c: moves.toCharArray()){
            if(c=='U')y++;
            else if(c =='D') y--;
            else if(c =='R') x++;
            else if(c =='L') x--;
            else blanks++;
        }
        return Math.abs(x)+Math.abs(y)+blanks;
    }
}