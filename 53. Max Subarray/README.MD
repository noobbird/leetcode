题目描述
===
Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
the contiguous subarray [4,-1,2,1] has the largest sum = 6.
思路一
---
```java
int maxCur = nums[0];
int maxSoFar = nums[0];
for(int i = 1; i < nums.length; i++){
	maxCur = Math.max(nums[i] , maxCur += nums[i]);
	if(maxCur > maxSoFar)
		maxSoFar = maxCur;
}
最大数组算法
思路二
---
计算到当前数组位置最大的和值为多少
```java
int n = nums.length;
int[] dp = new int[n];//dp[i] means the maximum subarray ending with A[i];
dp[0] = nums[0];
int max = dp[0];

for(int i = 1; i < n; i++){
	dp[i] = nums[i] + (dp[i - 1] > 0 ? dp[i - 1] : 0);
	max = Math.max(max, dp[i]);
}
        
