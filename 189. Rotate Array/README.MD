题目
===
Rotate an array of n elements to the right by k steps.

For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] 
is rotated to [5,6,7,1,2,3,4].
思路一
---
使用额外空间，将要结果数组的放到一个临时数组内，然后再重新赋值原数组
时间复杂度: O(n)
空间复杂度: O(n)
```java
public void rotate(int[] nums, int k) {
	k %= nums.length;
	int []aux = new int [nums.length];
	for(int i = 0; i < nums.length; i++){
		aux[(i+k)%nums.length] = nums[i];
	}
	for(int i =0 ; i < nums.length; i++){
		nums[i] = aux[i];
	}
}
思路二
---
循环替换,记录替换次数，当替换次数达到n时代表替换完成。核心为一连串替换，
比如从 curr=0 开始， next=(curr+k)%n,将 next 处的值设为 curr 处的值，如此
迭代，直到 curr 回到了0位置，这代表这轮替换完成
时间复杂度: O(n)
空间复杂度: O(1)
```java
public void rotate(int[] nums, int k) {
	k %= nums.length;
	int pos = 0;
	for(int count = 0; count < nums.length; pos++){
		int curr = pos;
		int pre = nums[curr];
		do{
			int next = (curr + k)%nums.length;
			int tmp = nums[next];
			nums[next] = pre;
			pre = tmp;
			curr = next;
			count++;
		}while(curr != pos);
		
	}
}


思路三
---
反转数组，思想为循环移出的会到前面，那么可以先将其逆序放到前面，然后再将顺序反转回来
时间复杂度: O(n)
空间复杂度: O(1)
```java
public void rotate(int[] nums, int k) {
	k %= nums.length;
	reverse(nums, 0, nums.length - 1);
	reverse(nums, 0,k - 1);
	reverse(nums, k, nums.length - 1);
}
private void reverse(int []nums, int start, int end){
	while(start < end){
		int tmp = nums[start];
		nums[start++] = nums[end];
		nums[end--] = tmp; 
	}
}

