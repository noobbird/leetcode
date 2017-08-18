题目
===

Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.

Find all the elements that appear twice in this array.

Could you do it without extra space and in O(n) runtime?

Example:
Input:
[4,3,2,7,8,2,3,1]

Output:
[2,3]
思路
---
当找到一个元素i, 将处于 i-1 位置的元素变为负数，如果已经是负数了，那么说明这个数出现了两次
```java
public List<Integer> findDuplicates(int[] nums) {
	List<Integer> list = new ArrayList<>();
	for(int i = 0; i < nums.length; i++){
		int val = Math.abs(nums[i]) - 1;
		if(nums[val] < 0)
			list.add(val + 1);
		else
			nums[val] = -nums[val];
	}
	return list;
}