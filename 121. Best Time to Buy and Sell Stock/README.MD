题目描述
===
Say you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.

Example 1:
```
Input: [7, 1, 5, 3, 6, 4]
Output: 5

max. difference = 6-1 = 5 (not 7-1 = 6, as selling price needs to be larger than buying price)
Example 2:
```
Input: [7, 6, 4, 3, 1]
Output: 0

In this case, no transaction is done, i.e. max profit = 0.

思路：
---
利用kadane algorithm [markdown](https://en.wikipedia.org/wiki/Maximum_subarray_problem),亦称为连续最大子数组问题，代码如下：
```python
def max_subarray(A):
    max_ending_here = max_so_far = A[0]
    for x in A[1:]:
        max_ending_here = max(x, max_ending_here + x)
        max_so_far = max(max_so_far, max_ending_here)
    return max_so_far
将数组连续两个数字做差即可转化为上述问题，因此解决方案如下：
```java
public int maxProfit(int[] prices) {
	int maxProfit = 0, curProfit = 0;
	for(int i = 1; i < prices.length; i++){
		curProfit = Math.max(0, curProfit += prices[i] - prices[i - 1]);
		if(curProfit > maxProfit)
			maxProfit = curProfit;
			
	}
	return maxProfit;
