class Solution {
    public int[] findOriginalArray(int[] changed) {
        int[] answer = new int[changed.length / 2];
        Arrays.sort(changed);
        Queue<Integer> q = new LinkedList<>();
        int idx = 0;
        for(int num : changed) {
            if(!q.isEmpty() && q.peek() == num) answer[idx++] = q.poll()/2;
            else q.add(num * 2);
        }
        
        return q.size() == 0 ? answer : new int[]{};
    }
}