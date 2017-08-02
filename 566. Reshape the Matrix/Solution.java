public class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int row = nums.length;
        int col = nums[0].length;
        if(row * col != r * c)
            return nums;
        int [][] res = new int[r][c];
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                int pos = i*c + j;
                res[i][j] = nums[pos/col][pos %col];
            }
        }
        return res;
    }
}