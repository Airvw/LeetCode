class Solution {
    public String makeGood(String s) {
        Deque<Character> dq = new ArrayDeque<>();
        int i = 0;
        while(i < s.length()){
            if(dq.size() < 1){
                dq.add(s.charAt(i));
            }
            else{
                char a = dq.peekLast();
                char b = s.charAt(i);
                if(a != b && Character.toUpperCase(a) == Character.toUpperCase(b)){
                    dq.pollLast();
                }
                else{
                    dq.add(b);
                }
            }
            i++;
        }
        StringBuilder sb = new StringBuilder();
        while(!dq.isEmpty())
            sb.append(dq.poll());

        return sb.toString();
    }
}
