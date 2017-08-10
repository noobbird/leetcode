题目
===
Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the absolute 
difference between i and j is at most k.
思路
---
利用Set，使用滑动窗口，窗口大小为 (k-1)， 在循环下标超过k时如果添加
不到set中，说明有重复； 在下标小于等于k时直接添加元素，如果添加set中
已有元素，返回true
```java
public boolean containsNearbyDuplicate(int[] nums, int k) {
	Set<Integer> set = new HashSet<Integer>();
	for(int i = 0; i < nums.length; i++){
		if(i > k)
			set.remove(nums[i-k-1]);
		if(!set.add(nums[i]))
			return true;
	}
	return false;
}