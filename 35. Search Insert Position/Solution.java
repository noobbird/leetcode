public class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        int mid = (l + r)>>1;
        while(l <= r){
            if(nums[mid] == target){
                return mid;
            } 
            if(nums[mid] < target)
                l = mid + 1;
            else
                r = mid - 1;
            mid = (l + r)>>1;
        }
        return l;
    }
}