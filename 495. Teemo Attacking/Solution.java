class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if(timeSeries.length == 0)
            return 0;
        if(timeSeries.length == 1)
            return duration;
        int total = 0;
        for(int i = 1; i < timeSeries.length; i++){
            total += (timeSeries[i] - timeSeries[i - 1]>=duration?duration:timeSeries[i] - timeSeries[i - 1]);
        }
        return total+duration;
    }
}