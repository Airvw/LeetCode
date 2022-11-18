class Solution {
    public String reverseWords(String s) {
        String[] values = s.split(" ");
        StringBuilder sb = new StringBuilder();
        Deque<String> dq = new ArrayDeque<>();
        for(String word : values){
            if(!word.equals("")) dq.add(word);
        }
        while(!dq.isEmpty()){
            sb.append(dq.pollLast() + " ");
        }
        
        return sb.toString().substring(0, sb.length() - 1);
    }
}
