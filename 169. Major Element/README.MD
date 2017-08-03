题目描述
===
>寻找数组中超过个数⌊ n/2 ⌋的元素的值
思路
---
>类比于投票，数组元素从左到右开始看作一个一个的投票者
第一个投票之后，count++，如果第二个元素跟其不同，相当于投反对票，
count--；由于主要元素超过2/n，因此此票肯定能留下。
```java
for(int i = 0; i < nums.length; i++){
	if(count == 0){
		major = nums[i];
	}
	if(nums[i] == major)
		count++;
	else
		count--;
}