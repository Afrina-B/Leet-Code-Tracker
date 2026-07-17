// Last updated: 7/17/2026, 11:54:57 PM
class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        return (arrivalTime + delayedTime)%24;
    }
}