public class Solution {
    public int arrayPairSum(int[] nums) {
        int len = nums.length;
        int sum = 0;
        for(int i = 0; i < len - 1; i++){
            for(int j = i + 1; j > 0 && nums[j] < nums[j - 1]; j--){
                int temp = nums[j];
                nums[j] = nums[j - 1];
                nums[j - 1] = temp;
            }
        }
        for(int i = 0; i < len; i+=2){
            sum += nums[i];
        }
        return sum;
    }
}