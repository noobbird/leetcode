public class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int len = nums.length;
        int end = 0, begin = 1;
        int min = nums[len - 1];
        int max = nums[0];
        for(int i = 1; i < len; i++){
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[len - i - 1]);
            if(nums[i] < max)
                end = i;
            if(nums[len - i - 1] > min)
                begin = len - i - 1;
        }
        return end - begin + 1;
    }
}