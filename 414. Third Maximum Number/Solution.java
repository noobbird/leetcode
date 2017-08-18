public class Solution {
    public int thirdMax(int[] nums) {
        Integer max1 = null, max2 = null, max3 = null;
        for(Integer i : nums){
            if((max1 != null && max1.equals(i) )|| (max2 != null &&max2.equals(i)) || (max3 != null && max3.equals(i))) continue;
            if(max1 == null || i > max1){
                max3 = max2;
                max2 = max1;
                max1 = i;
            }else if( max2 == null || i > max2){
                max3 = max2;
                max2 = i;
            }else if(max3 == null || i > max3){
                max3 = i;
            }
        }
        return max3==null?max1:max3;

    }
}