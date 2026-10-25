class Solution {
    public long possibleHr(int piles[],int mid){
        long noOfhr = 0;
        for(int i = 0;i<piles.length;i++){
            noOfhr += (int) Math.ceil((double) piles[i] / mid);
        }
        return noOfhr;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = -1;
        int ans = -1;
        for(int i = 0;i<piles.length;i++){
            high = Math.max(piles[i],high);
        }

        while(low<=high){
            int mid = (low + high)/2;


            if(possibleHr(piles,mid) <= h){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
}
