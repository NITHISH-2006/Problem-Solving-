class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        int ALL = (1 << n) - 1;
        dfs(nums, 0, ALL, res, new ArrayList<>());
        return res;
    }

    public static void dfs(int[] nums, int mask, int ALL, List<List<Integer>> res, List<Integer> temp){

        if(mask == ALL){
            res.add(new ArrayList<>(temp));
        }   
        for(int i = 0; i< nums.length ; i++){
            if((mask & (1 << i)) == 0 ){
                temp.add(nums[i]);
                dfs(nums, mask | (1 << i), ALL, res, temp);
                temp.remove(temp.size() - 1);
            }
        }

    }
}