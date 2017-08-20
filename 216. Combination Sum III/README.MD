题目
===
Find all possible combinations of k numbers that add up to a number n, given that only numbers from 1 to 9 can be used and each combination should be a unique set of numbers.


Example 1:

Input: k = 3, n = 7

Output:

[[1,2,4]]

Example 2:

Input: k = 3, n = 9

Output:

[[1,2,6], [1,3,5], [2,3,4]]

思路
---
回溯法
```java
public List<List<Integer>> combinationSum3(int k, int n) {
	List<List<Integer>> res = new ArrayList<>();
	List<Integer> tmp = new ArrayList<>();
	findComb(res, tmp, 1, k, n);
	return res;
}
private void findComb(List<List<Integer>> res, List<Integer> tmp, int start, int  k, int n){
	if(k < 0 || n<0)
		return;
	if(k ==0 && n == 0){
		res.add(new ArrayList<Integer>(tmp));
		return;
	}
	for(int i = start; i <=9; i++){
		tmp.add(i);
		findComb(res, tmp, i + 1, k - 1, n - i);
		tmp.remove(tmp.size() - 1);
	}
	
}
