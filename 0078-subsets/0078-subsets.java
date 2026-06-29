class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res  = new ArrayList<>();
        int n = nums.length ;
        int totalsubsets = 1 << n;

        for(int m = 0 ; m < totalsubsets ; m++){
            List<Integer> subset = new ArrayList<>();
            for(int i = 0 ; i< n ; i++){
                if((m & (1 << i)) != 0){
                    subset.add(nums[i]);
                }
            }
            res.add(subset);
        }
        return res;

    }
}