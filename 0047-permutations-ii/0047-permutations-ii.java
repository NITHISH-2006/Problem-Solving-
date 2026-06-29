class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        int ALL = (1 << n) - 1;
        Arrays.sort(nums);
        dfs(nums, 0, res, new ArrayList<>(), ALL);
        return res;
    }

    public static void dfs(int nums[], int mask, List<List<Integer>> res, List<Integer> temp, int ALL) {
        if (mask == ALL) {
            res.add(new ArrayList<>(temp));
        }
        for (int i = 0; i < nums.length; i++) {
            if ((mask & (1 << i)) == 0) {
                if (i > 0 && nums[i] == nums[i - 1] && (mask & (1 << (i - 1))) == 0)
                    continue;
                temp.add(nums[i]);
                dfs(nums, mask | (1 << i), res, temp, ALL);
                temp.remove(temp.size() - 1);
            }
        }

    }

}