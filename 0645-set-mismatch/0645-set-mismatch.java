class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];
        int n = nums.length;
        int[] check = new int[n + 1];
        for(int i = 0; i < n; i++){
            check[nums[i]]++;
            if(check[nums[i]] > 1)
                ans[0] = nums[i];
        }
        for(int i = 1; i <= n; i++){
            if(check[i] == 0){
                ans[1] = i;
                break;
            }
        }

        return ans;
    }
}