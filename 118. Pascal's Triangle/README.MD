题目
===
Given numRows, generate the first numRows of Pascal's triangle.

For example, given numRows = 5,
Return

[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]
思路
---
An[i] = An-1[i-1] + An-1[i];
```java
public List<List<Integer>> generate(int numRows) {
	List<List<Integer>> res = new ArrayList<List<Integer>>();
	List<Integer> row, pre = null;
	for(int i = 0; i < numRows; i++){
		row = new ArrayList<Integer>();
		for(int j = 0; j < i + 1; j++){
			if( j == 0 || j== i )
				row.add(j, 1);
			else
				row.add(j, pre.get(j - 1) + pre.get(j));
		}
		pre = row;
		res.add(row);
	}
	return res;
}