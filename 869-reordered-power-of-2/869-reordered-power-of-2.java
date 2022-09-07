class Solution {
    public boolean reorderedPowerOf2(int n) {
        String s = Integer.toString(n);
        int[] arr = new int[s.length()];
        for(int i = 0; i < arr.length; i++){
            arr[i] = s.charAt(i) - '0';
        }
        return permutation(arr, 0);
    }

    private boolean permutation(int[] arr, int start){
        if(arr.length == start)
            return isPowerOfTwo(arr);

        for(int i = start; i < arr.length; i++){
            swap(arr, start, i);

            if(permutation(arr, start + 1)) return true;

            swap(arr, start, i);
        }

        return false;
    }

    private void swap(int[] arr, int start, int i) {
        int t = arr[start];
        arr[start] = arr[i];
        arr[i] = t;
    }

    private boolean isPowerOfTwo(int[] arr){
        if(arr[0] == 0) return false;
        int result = 0;
        for(int x : arr){
            result = 10 * result + x;
        }

        while(result > 0 && ((result & 1) == 0)){
            result >>= 1;
        }

        return result == 1;
    }
}