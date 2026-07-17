// Last updated: 7/17/2026, 11:54:25 PM
class Solution {
    private static final long MOD=1_000_000_007L;
    public int maxTotalValue(int[] value, int[] decay, int m) {
         long lo=1,hi=1_000_000_000L;
          long best=0;
          while(lo<=hi){
              long mid=lo +(hi-lo)/2;
              if(count(value,decay,mid)>=m){
                  best=mid;
                  lo=mid+1;
              }else{
                  hi=mid-1;
              }
            }
            long total=0;
            long used=0;
            for(int i=0;i< value.length;i++){
                if(value[i]<best)continue;
                long t=(value[i]-best)/decay[i]+1;
                used+=t;
                long first=value[i];
                long last=value[i]-(t-1)*(long)decay[i];

                long sum=t*(first+last)/2;
                total=(total+sum)%MOD;
            }
               
                long extra=used-m;
                total=(total-(extra%MOD)*(best%MOD))%MOD;
                if(total<0) total +=MOD;
                 return (int) total;
    }
        private long count(int[] value, int[] decay, long x) {
            long cnt=0;
             for(int i=0;i<value.length;i++){
                 if(value[i]>=x){
                     cnt+=(value[i]-x)/ decay[i]+1;
                 }
             }
                  return cnt;
        }
    }
