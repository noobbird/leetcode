求一个数组中和为目标值的两个数的下标
===
#思路：
>借助一个HashMap，其中键为数组元素的值，值为数组的下标。
然后遍历数组，遍历过程中判断目标值减去当前值是否在已有
的键中，如果有则找到了，没有将当前的值与下标加入map中。
```java
for(int i = 0;  i < len; i++){
	int complement = target - nums[i];
	if(map.containsKey( complement) && map.get(complement)
		return new int[]{map.get(complement), i};
	else
	 map.put(nums[i], i);
}