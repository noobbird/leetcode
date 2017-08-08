public class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int []res = new int[nums.length - k + 1];
        int sum = 0;
        for(int i = 0; i < k; i++)
            sum += nums[i];
        res[0] = sum;
        int max = res[0];
        for(int i = k; i < nums.length; i++){
            sum  += nums[i] - nums[i - k];
            res[i - k + 1] = sum;
            if(max < res[i - k +1])
                max = res[i - k + 1];
        }
        return (double)max/k;
    }
}