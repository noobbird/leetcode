题目
===
Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

Note:
You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2. The number of elements initialized in nums1 and nums2 are m and n respectively.
思路
---
从右到左开始放
```java
public void merge(int[] nums1, int m, int[] nums2, int n) {
	int pos1 = m - 1;
	int pos2 = n - 1;
	int end = n + m -1;
	while(pos1>=0 && pos2 >= 0)
		if(nums1[pos1]>nums2[pos2])
			nums1[end--] = nums1[pos1--];
		else
			nums1[end--] = nums2[pos2--];
	while(pos2>=0)
		nums1[end--] = nums2[pos2--];

}