题目
===
Given an index k, return the kth row of the Pascal's triangle.

For example, given k = 3,
Return [1,3,3,1].

Note:
Could you optimize your algorithm to use only O(k) extra space?
思路
---
与Pascal's Triangle 相同
```java
public List<Integer> getRow(int rowIndex) {
	List<Integer> res = new ArrayList<Integer>();
	for(int i = 0; i <= rowIndex; i++){
		res.add(0,1);
		for(int j = 1; j < res.size() - 1; j++){
			res.set(j, res.get(j) + res.get(j + 1));
		}
	}
	return res;
}