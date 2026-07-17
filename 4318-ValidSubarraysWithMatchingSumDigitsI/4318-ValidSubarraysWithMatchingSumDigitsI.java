// Last updated: 7/17/2026, 11:54:41 PM
class Solution {
    public int countValidSubarrays(int[] nums, int x) {
       int n=nums.length;
        int ans=0;
        for(int i=0;i<n;i++){
            long sum =0;
         for(int j=i;j<n;j++){
            sum+=nums[j];
            if(isValid(sum,x)){
                ans++;
            }
        }
    }
    return ans;    
}
    private boolean isValid(long sum,int x){
        if(sum % 10 !=x){
            return false;
        }
        long temp=sum;
        while(temp>=10){
            temp/=10;
        }
        return temp==x;
    }
}