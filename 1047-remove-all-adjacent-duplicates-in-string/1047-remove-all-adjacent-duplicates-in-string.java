class Solution {
    public String removeDuplicates(String s) {
        Deque<Character> dq = new ArrayDeque<>();
        for(char ch : s.toCharArray()){
            if(!dq.isEmpty() && dq.peekLast() == ch){
                dq.pollLast();
            }
            else
                dq.add(ch);
        }
        StringBuilder sb = new StringBuilder();
        while(!dq.isEmpty())
            sb.append(dq.pollFirst());
        return sb.toString();
    }
}