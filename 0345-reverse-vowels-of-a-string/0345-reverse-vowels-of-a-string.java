class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder();
        Deque<Character> dq = new ArrayDeque<>();
        char[] vowel = new char[]{'a','e','i','o','u'};
        Set<Character> set = new HashSet<>();
        for(char ch : vowel){
            set.add(ch);
            set.add(Character.toUpperCase(ch));
        }

        for(Character ch : s.toCharArray()){
            if(set.contains(ch)) dq.add(ch);
        }

        for(char ch : s.toCharArray()){
            if(set.contains(ch))
                sb.append(dq.pollLast());
            else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}