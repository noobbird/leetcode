class Solution {
    public int arrayNesting(int[] nums) {
        int max = 0;
        for(int i = 0; i < nums.length; i++){
            int count = 1;
            if(nums[i] > 0){
                int curr = i;
                nums[curr] = -nums[curr];
                while(Math.abs(nums[curr]) != i){
                    curr = -nums[curr];     
                    nums[curr] = -nums[curr];
                    count ++;
                }
            }
            max = Math.max(max, count);
        }
        return max;
    }
}