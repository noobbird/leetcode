题目描述
===
在一个长度为n的数组中，数组元素1<=a[i]<=n,其中可能有重复的，
可能有些数字未出现，找出没出现的数字。
要求时间复杂度为O(n)，且不使用额外空间。
解题思路
==
将出现过的数字所对应下标位置的数字变成负数。
```java
for(int i = 0; i < len; i++ ){
	int val = Math.abs(nums[i]) - 1;
	if(nums[val] > 0)
		nums[val] = -nums[val];
}