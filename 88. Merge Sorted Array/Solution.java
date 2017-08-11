public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int pos1 = m - 1;
        int pos2 = n - 1;
        int end = n + m -1;
        while(pos1>=0 && pos2 >= 0)
            if(nums1[pos1]>nums2[pos2])
                nums1[end--] = nums1[pos1--];
            else
                nums1[end--] = nums2[pos2--];
        while(pos2>=0)
            nums1[end--] = nums2[pos2--];

    }
}