题目
===
Given a non-negative integer represented as a non-empty array of digits, plus one to the integer.

You may assume the integer do not contain any leading zero, except the number 0 itself.

The digits are stored such that the most significant digit is at the head of the list.
思路
---
有两种情况，一种是全是 9 ，需要增加数组位数。 另一种不需要，这种
情况只需要从数组尾部开始循环判断即可，如果遇到9，变为零，如果
不为 9 ，加一跳出循环
```java
for(int i = len - 1; i >= 0; i--){
	if(digits[i] < 9){
		digits[i]++;
		return digits;
	}
	digits[i] = 0;

}
int []newDigits = new int[len + 1];
newDigits[0] = 1;
return newDigits;