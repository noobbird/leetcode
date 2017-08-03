题目
===
判断一个数组是否包含重复元素
思路
--
>利用HashSet，遍历数组过程中判断是否有当前元素，没有就添加，有就返回true
```java
for(int n : nums){
	if(set.contains(n))
		return true;
	else
		set.add(n);
}
