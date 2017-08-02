最长的连续数字
===
题目描述：
---
>一串0，1整数数组，找出最长的连续1的长度。
思路:
---
>很简单，遇到一开始加连续1的数目，如果比先前遇到的大，
更新最大长度。遇到零重置。
```java
for(int i = 0; i < len; i++){
	if(nums[i] == 1) {
		count++;
		maxCount = Math.max(maxCount, count);
	}
	else
		count = 0;
}