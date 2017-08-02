public class Solution{
	public int findMaxConsecutiveOnes(int [] nums){
		int len = nums.length;
		int count = 0;
		int maxCount = 0;
		for(int i = 0; i < len; i++){
			if(nums[i] == 1) {
				count++;
				maxCount = Math.max(maxCount, count);
			}
			else
				count = 0;
		}
	}
}