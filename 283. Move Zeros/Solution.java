public class Solution {
    public void moveZeroes(int[] nums) {
        int len = nums.length;
        int insertPos = 0;
        for(int i = 0; i < len; i++){
            if(nums[i] != 0)
                nums[insertPos++] = nums[i];
        }
        while(insertPos < len)
            nums[insertPos++] = 0;
    }
}