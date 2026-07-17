// Last updated: 7/17/2026, 11:54:50 PM
class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        int roundedAmount= (purchaseAmount + 5) / 10 * 10;
       return 100-roundedAmount; 
    }
}