public class Solution {
    public int missingNumber(int[] nums) {
        int xor=0;
        int i;
        for( i = 0; i < nums.length; i++){
            xor = xor^i^nums[i];
        }
        return xor^i;
    }
    //     public int missingNumber(int[] nums) {
    //     int expectSum = nums.length*(nums.length + 1)/2;  
    //     int sum = 0;
    //     for(int i = 0; i < nums.length; i++){
    //         sum += nums[i];
    //     }
    //     return expectSum - sum;
    // }
}