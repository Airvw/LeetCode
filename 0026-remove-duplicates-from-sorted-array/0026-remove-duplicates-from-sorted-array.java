class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int i = 0;
        for(int num : nums){
            if(!set.contains(num)){
                nums[i++] = num;
            }
            set.add(num);
        }

        return set.size();
    }
}