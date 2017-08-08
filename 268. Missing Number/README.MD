题目描述
===
Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
For example,
Given nums = [0, 1, 3] return 2.
思路一
---
>先求假如不缺数字的所有数字和，然后在减去实际的总和，差值即为缺的数字
```java
int expectSum = nums.length*(nums.length + 1)/2;  
int sum = 0;
for(int i = 0; i < nums.length; i++){
sum += nums[i];
}
return expectSum - sum;
思路二
---
>利用亦或的性质，a^b^b = a；推广一下，将完整的序列与缺失的序列一起亦或可得缺失的数字，
因为缺失的数字只有一个，因此会被留下
```java
int xor=0;
int i;
for( i = 0; i < nums.length; i++){
	xor = xor^i^nums[i];
}
return xor^i;
