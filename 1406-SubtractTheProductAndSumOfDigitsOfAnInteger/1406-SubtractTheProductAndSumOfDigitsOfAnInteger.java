// Last updated: 7/17/2026, 11:55:39 PM
class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int mul=1;
        int digit =0;
        while(n!=0){
            digit=n%10;
            sum=sum+digit;
            mul=mul*digit;
            n=n/10;
        }
        return mul -sum;
    }
}