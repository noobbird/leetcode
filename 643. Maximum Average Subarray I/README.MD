题目
===
Given an array consisting of n integers, find the contiguous subarray of given length k that has the maximum average value. And you need to output the maximum average value.

Example 1:
Input: [1,12,-5,-6,50,3], k = 4
Output: 12.75
Explanation: Maximum average is (12-5-6+50)/4 = 51/4 = 12.75
Note:
>1 <= k <= n <= 30,000.
>Elements of the given array will be in the range [-10,000, 10,000].
思路
---
k个元素为一个窗口，先计算第一个窗口的值，然后移动窗口，sum += sum - nums[i - k] + nums[i]
```java
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