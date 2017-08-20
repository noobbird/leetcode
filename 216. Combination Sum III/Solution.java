class Solution {
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
}