题目
===
Suppose you have a long flowerbed in which some of the plots are planted and some are not. However, flowers cannot be planted in adjacent plots - they would compete for water and both would die.

Given a flowerbed (represented as an array containing 0 and 1, where 0 means empty and 1 means not empty), and a number n, return if n new flowers can be planted in it without violating the no-adjacent-flowers rule.

Example 1:
Input: flowerbed = [1,0,0,0,1], n = 1
Output: True
Example 2:
Input: flowerbed = [1,0,0,0,1], n = 2
Output: False
Note:
The input array won't violate no-adjacent-flowers rule.
The input array size is in the range of [1, 20000].
n is a non-negative integer which won't exceed the input array size.
思路
---
除去数组第一位和最后一位做特殊处理，其它元素判断当前位置以及其前后
元素是否为零
```java
public boolean canPlaceFlowers(int[] flowerbed, int n) {
	int count = 0;
	if(flowerbed.length == 1 )
		return n<=(flowerbed[0]==0?1:0)?true:false;
	if(flowerbed.length > 1){
		if(flowerbed[0] == 0 && flowerbed[1] == 0){
			count ++;
			flowerbed[0] = 1;
		}
		if(flowerbed[flowerbed.length - 1] == 0 && flowerbed[flowerbed.length - 2] == 0){
			count++;
			flowerbed[flowerbed.length - 1] = 1;
		}
	}
	for(int i = 1; i < flowerbed.length - 1; i++){
		if(flowerbed[i] ==0 && flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0){
			count ++;
			flowerbed[i] = 1;
			i++;
			
		}
	}
	return count>=n?true:false;
	
	
}