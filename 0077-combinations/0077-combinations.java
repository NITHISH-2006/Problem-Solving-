class Solution {
    public List<List<Integer>> combine(int n, int k) {
        int[] nums = new int[n];
        for(int i = 0 ; i < nums.length ; i++){
            nums[i] = i+1;
        }
        List<List<Integer>> res = new ArrayList<>();
        dfs(nums, res, new ArrayList<>(), 0, k);
        return res;

    }

    public static void dfs(int[] nums, List<List<Integer>> res, List<Integer> temp, int start, int k){
        if(temp.size() == k){
            res.add(new ArrayList<>(temp));
        }
        
        for(int i = start ; i < nums.length ; i++){
            temp.add(nums[i]);
            dfs(nums, res, temp, i + 1, k);
            temp.remove(temp.size() - 1);
        }

    }
}