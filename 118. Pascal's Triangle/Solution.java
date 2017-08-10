public class Solution {
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
}