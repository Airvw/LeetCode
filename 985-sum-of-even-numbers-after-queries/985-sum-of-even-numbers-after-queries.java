class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int[] answer = new int[nums.length];

        int total = 0;
        for(int num : nums){
            if(num % 2 == 0) total += num;
        }

        int i = 0;
        for(int[] query : queries){
            int val = query[0];
            int idx = query[1];
            int prev = nums[idx];
            nums[idx] += val;
            if(prev % 2 == 0){
                if(nums[idx] % 2 == 0) total += val;
                else total -= prev;
            }
            else{
                if(nums[idx] % 2 == 0) total += nums[idx];
            }
            answer[i++] = total;
        }
        return answer;
    }
}