class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int sum = coins ;
        int count = 0 ;
        Arrays.sort(costs);
        
        for(int i = 0 ; i < costs.length ; i++){
            if(sum < costs[i]){
                break;
            }
            sum -= costs[i];
            count++;
        }
        return count;
    }
}