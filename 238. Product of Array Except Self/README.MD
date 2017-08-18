题目
===
Given an array of n integers where n > 1, nums, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

Solve it without division and in O(n).

For example, given [1,2,3,4], return [24,12,8,6].

Follow up:
Could you solve it with constant space complexity? (Note: The output array does not count as extra space for the purpose of space complexity analysis.)
思路
---
结果数组某个位置的值为其前后所有数字的乘积，使用两个循环计算前后位置的乘积即可
时间复杂度: O(n)
空间复杂度: O(1)
```java
public int[] productExceptSelf(int[] nums) {
	int []res = new int[nums.length];
	res[0] = 1;
	for(int i = 1; i < nums.length; i++){
		res[i] = res[i - 1]*nums[i - 1];
	}
	int right = 1;
	for(int i = nums.length - 1; i >= 0; i--){
		res[i] *=right;
		right *= nums[i];
	}
	return res;
	
}