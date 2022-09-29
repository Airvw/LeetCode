class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> ans = new ArrayList<>();
        int idx = -1;
        int n = arr.length;
        for(int i = 0; i < n; i++){
            if(arr[i] < x) {
                idx = i;
            }
        }
        int left = idx;
        int right = idx + 1;
        while(ans.size() < k){
            if(left >= 0 && right < n){
                int a = Math.abs(arr[left] - x);
                int b = Math.abs(arr[right] - x);
                if(a <= b) ans.add(arr[left--]);
                else ans.add(arr[right++]);
            }
            else if(left >= 0){
                ans.add(arr[left--]);
            }
            else if(right < n){
                ans.add(arr[right++]);
            }
        }
        Collections.sort(ans);
        return ans;
    }
}