import java.util.Arrays;

class Solution {
    public boolean reorderedPowerOf2(int n) {
        int[] numArr = count(n);

        for(int i = 0; i < 31; i++){
            if(Arrays.equals(numArr, count(1 << i))){
                return true;
            }
        }

        return false;
    }

    public int[] count(int n) {
        int[] result = new int[10];
        while(n > 0){
            result[n % 10]++;
            n /= 10;
        }
        return result;
    }
}
