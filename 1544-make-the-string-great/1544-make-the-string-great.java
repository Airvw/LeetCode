class Solution {
    public String makeGood(String s) {
        Deque<Character> dq = new ArrayDeque<>();
        for(char ch : s.toCharArray()){
            if(!dq.isEmpty() && dq.peekLast() != ch && Character.toUpperCase(dq.peekLast()) == Character.toUpperCase(ch)){
                dq.pollLast();
            }
            else{
                dq.add(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!dq.isEmpty())
            sb.append(dq.poll());

        return sb.toString();
    }
}