题目
===
Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.

Here are few examples.
[1,3,5,6], 5 → 2
[1,3,5,6], 2 → 1
[1,3,5,6], 7 → 4
[1,3,5,6], 0 → 0
思路
---
二分查找解决，如果没有找到，left为插入的位置。因为 right=left+1 时，mid:=（right+left）/2=left.
如果 target>nums[mid], left :=mid + 1= right，target 应该在 left 位置; 如果 target < nums[mid], left不变。
target 也应该在 left 位置
```java
while(l <= r){
	if(nums[mid] == target){
		return mid;
	} 
	if(nums[mid] < target)
		l = mid + 1;
	else
		r = mid - 1;
	mid = (l + r)>>1;
}
return l;
